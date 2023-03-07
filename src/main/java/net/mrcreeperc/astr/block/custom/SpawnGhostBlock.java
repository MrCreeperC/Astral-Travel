package net.mrcreeperc.astr.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.mrcreeperc.astr.entity.ModEntities;
import net.mrcreeperc.astr.entity.custom.AstralGhostEntity;

public class SpawnGhostBlock extends Block {
    public SpawnGhostBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        super.onStateReplaced(state, world, pos, newState, moved);
        if (!world.isClient && state.getBlock() != newState.getBlock()) {
            // Спавним сущность в месте разрушенного блока
            AstralGhostEntity entity = new AstralGhostEntity(ModEntities.ASTRAL_GHOST, world);
            entity.setPosition(pos.getX() + 0.5, pos.getY() + 0.50, pos.getZ() + 0.5);
            world.spawnEntity(entity);
        }
    }
}
