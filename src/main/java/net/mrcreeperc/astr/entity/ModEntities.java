package net.mrcreeperc.astr.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mrcreeperc.astr.AstrMod;
import net.mrcreeperc.astr.entity.custom.AstralGhostEntity;
import net.mrcreeperc.astr.entity.custom.AstralWormBossEntity;
import net.mrcreeperc.astr.entity.custom.AstralWormSegmentsEntity;

public class ModEntities {
    public static final EntityType<AstralGhostEntity> ASTRAL_GHOST = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(AstrMod.MOD_ID, "astral_ghost_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, AstralGhostEntity::new)
                    .dimensions(EntityDimensions.fixed(0.40f, 0.50f)).build());
}
