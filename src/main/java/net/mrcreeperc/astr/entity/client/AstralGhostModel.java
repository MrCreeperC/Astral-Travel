package net.mrcreeperc.astr.entity.client;

import net.minecraft.util.Identifier;
import net.mrcreeperc.astr.AstrMod;
import net.mrcreeperc.astr.entity.custom.AstralGhostEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AstralGhostModel extends AnimatedGeoModel<AstralGhostEntity> {
    @Override
    public Identifier getModelResource(AstralGhostEntity object) {
        return new Identifier(AstrMod.MOD_ID, "geo/astral_ghost_entity.geo.json");
    }

    @Override
    public Identifier getTextureResource(AstralGhostEntity object) {
        return new Identifier(AstrMod.MOD_ID, "textures/entity/astral_ghost/astral_ghost_entity.png");
    }

    @Override
    public Identifier getAnimationResource(AstralGhostEntity animatable) {
        return new Identifier(AstrMod.MOD_ID, "animations/astral_ghost.animation.json");
    }
}
