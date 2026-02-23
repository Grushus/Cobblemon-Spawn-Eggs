package net.grubas.cobblemonspawneggs.item;

import net.grubas.cobblemonspawneggs.PokemonConfigManager;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class SpawnEggItem extends Item {

    private final String pokemonName;

    public SpawnEggItem(String pokemonName) {
        super(new Item.Properties());
        this.pokemonName = pokemonName;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (!context.getLevel().isClientSide()) {
            int[] levels = PokemonConfigManager.INSTANCE.getLevels(pokemonName);
            int min = levels[0];
            int max = levels[1];
            int level = min + (int)(Math.random() * (max - min + 1));

            MinecraftServer server = context.getLevel().getServer();
            CommandSourceStack source = context.getPlayer().createCommandSourceStack().withPermission(4);
            server.getCommands().performPrefixedCommand(source, "spawnpokemon " + pokemonName + " level=" + level);
        }
        return InteractionResult.SUCCESS;
    }
}
