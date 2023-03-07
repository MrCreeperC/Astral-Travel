package net.mrcreeperc.astr.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.mrcreeperc.astr.entity.ModEntities;
import net.mrcreeperc.astr.entity.custom.AstralGhostEntity;

public class ModRegistries {
    public static void registerModStuffs() {
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.ASTRAL_GHOST, AstralGhostEntity.createAstralGhostAttributes());
    }
}
