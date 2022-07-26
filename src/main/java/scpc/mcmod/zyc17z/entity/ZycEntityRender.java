package scpc.mcmod.zyc17z.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.util.math.vector.Vector3f;

public abstract class ZycEntityRender <T extends Entity> extends EntityRenderer<T> {

    public ZycEntityRender(EntityRendererManager manager) {
        super(manager);
    }

    @Override
    public void render(T entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {

    }

}
