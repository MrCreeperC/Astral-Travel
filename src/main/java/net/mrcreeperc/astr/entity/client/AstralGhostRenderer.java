package net.mrcreeperc.astr.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.mrcreeperc.astr.AstrMod;
import net.mrcreeperc.astr.entity.custom.AstralGhostEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AstralGhostRenderer extends GeoEntityRenderer<AstralGhostEntity> {
    public AstralGhostRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new AstralGhostModel());
        this.shadowRadius = 0.4f;
        this.heightScale = 3f;
        this.widthScale = 3f;
    }

    public Identifier getTextureLocation(AstralGhostEntity instance) {
        return new Identifier(AstrMod.MOD_ID, "textures/entity/astral_ghost/astral_ghost_entity.png");
    }

    @Override
    public RenderLayer getRenderType(AstralGhostEntity animatable, float partialTick, MatrixStack poseStack,
                                     VertexConsumerProvider bufferSource, VertexConsumer buffer, int packedLight, Identifier texture) {
        poseStack.scale(0.8f, 0.8f, 0.8f);


        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
