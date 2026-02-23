package net.grubas.cobblemonspawneggs;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.neoforged.fml.loading.FMLPaths;

import java.io.*;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class PokemonConfigManager {

    public static final PokemonConfigManager INSTANCE = new PokemonConfigManager();

    private static final String CONFIG_FILE = "pokemon_data.json";
    private static final Gson GSON = new Gson();

    // Maps command name (e.g. "bulbasaur", "alolan rattata") to [minLevel, maxLevel]
    private final Map<String, int[]> levelMap = new HashMap<>();

    private PokemonConfigManager() {}

    public void load() {
        Path configDir = FMLPaths.CONFIGDIR.get().resolve(CobblemonSpawnEggs.MOD_ID);
        Path configFile = configDir.resolve(CONFIG_FILE);

        try {
            // Create config directory if it doesn't exist
            Files.createDirectories(configDir);

            // If the file doesn't exist, copy the default from resources
            if (!Files.exists(configFile)) {
                copyDefaultConfig(configFile);
            }

            // Read and parse the JSON
            try (Reader reader = Files.newBufferedReader(configFile)) {
                JsonArray array = GSON.fromJson(reader, JsonArray.class);
                levelMap.clear();

                for (JsonElement element : array) {
                    JsonObject obj = element.getAsJsonObject();
                    String name = obj.get("name").getAsString().trim();
                    int minLevel = obj.get("min_level").getAsInt();
                    int maxLevel = obj.get("max_level").getAsInt();

                    // Convert name to command key the same way SpawnEggItem uses it
                    String key = nameToKey(name);
                    levelMap.put(key, new int[]{minLevel, maxLevel});
                }

                CobblemonSpawnEggs.LOGGER.info("[CobblemonSpawnEggs] Loaded {} pokemon level configs", levelMap.size());
            }

        } catch (IOException e) {
            CobblemonSpawnEggs.LOGGER.error("[CobblemonSpawnEggs] Failed to load pokemon_data.json, defaulting all levels to 1", e);
        }
    }

    public int[] getLevels(String commandName) {
        return levelMap.getOrDefault(commandName.toLowerCase().trim(), new int[]{1, 1});
    }

    private void copyDefaultConfig(Path destination) throws IOException {
        InputStream defaultStream = getClass().getResourceAsStream("/config_defaults/" + CONFIG_FILE);
        if (defaultStream != null) {
            Files.copy(defaultStream, destination);
            CobblemonSpawnEggs.LOGGER.info("[CobblemonSpawnEggs] Created default pokemon_data.json in config folder");
        } else {
            CobblemonSpawnEggs.LOGGER.warn("[CobblemonSpawnEggs] No default pokemon_data.json found in mod resources");
        }
    }

    private String nameToKey(String name) {
        // Match the same logic as the Python script:
        // "Rattata [Alolan]" -> "alolan rattata"
        // "Bulbasaur" -> "bulbasaur"
        String result = name.toLowerCase().trim();
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("\\[(.+?)\\]").matcher(result);
        if (m.find()) {
            String variant = m.group(1).trim();
            String base = result.replaceAll("\\[.+?\\]", "").trim();
            return variant + " " + base;
        }
        return result;
    }
}