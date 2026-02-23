package net.grubas.cobblemonspawneggs.item;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class SpawnEggItem extends Item {

    private final String pokemonName;
    private final int minLevel;
    private final int maxLevel;

    public SpawnEggItem(String pokemonName, int minLevel, int maxLevel) {
        super(new Item.Properties());
        this.pokemonName = pokemonName;
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (!context.getLevel().isClientSide()) {
            int level = minLevel + (int)(Math.random() * (maxLevel - minLevel + 1));
            MinecraftServer server = context.getLevel().getServer();
            CommandSourceStack source = context.getPlayer().createCommandSourceStack().withPermission(4);
            server.getCommands().performPrefixedCommand(source, "spawnpokemon " + pokemonName + " level=" + level);
        }
        return InteractionResult.SUCCESS;
    }
}
