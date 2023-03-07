package net.mrcreeperc.astr;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.mrcreeperc.astr.entity.ModEntities;
import net.mrcreeperc.astr.entity.client.AstralGhostRenderer;

public class AstrModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.ASTRAL_GHOST, AstralGhostRenderer::new);
    }
}
