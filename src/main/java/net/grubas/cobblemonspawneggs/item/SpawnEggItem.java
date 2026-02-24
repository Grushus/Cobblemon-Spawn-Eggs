package net.grubas.cobblemonspawneggs.item;

import net.grubas.cobblemonspawneggs.PokemonConfigManager;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.minecraft.server.level.ServerLevel;
import com.cobblemon.mod.common.api.pokemon.PokemonProperties;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;

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

            ServerLevel level_world = (ServerLevel) context.getLevel();
            BlockPos pos = context.getClickedPos().relative(context.getClickedFace());
            Vec3 spawnPos = Vec3.atBottomCenterOf(pos);

            // Parse pokemon properties using Cobblemon's API
            PokemonProperties props = PokemonProperties.Companion.parse(
                    pokemonName + " level=" + level, " ", "="
            );

            // Create and spawn the entity directly
            PokemonEntity entity = props.createEntity(level_world);
            entity.setPos(spawnPos.x, spawnPos.y, spawnPos.z);
            level_world.addFreshEntity(entity);
        }
        return InteractionResult.SUCCESS;
    }
}
