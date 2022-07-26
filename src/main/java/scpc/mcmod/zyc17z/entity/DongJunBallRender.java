package scpc.mcmod.zyc17z.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraft.util.math.vector.Vector3f;
import scpc.mcmod.zyc17z.ZycMod;

import javax.annotation.Nonnull;

public class DongJunBallRender extends ZycEntityRender<DongJunBall> {

    private EntityModel<DongJunBall> dongJunBallModel;

    public DongJunBallRender(EntityRendererManager renderManager) {
        super(renderManager);
        dongJunBallModel = new DongJunBallModel();
    }

    @Nonnull
    @Override
    public ResourceLocation getEntityTexture(@Nonnull DongJunBall entity) {
        return ZycMod.rl("textures/entity/dongjun_ball.png");
    }


    @Override
    public void render(DongJunBall entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.push();
        matrixStackIn.rotate(Vector3f.YN.rotationDegrees(0));
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(this.dongJunBallModel.getRenderType(this.getEntityTexture(entityIn)));
        this.dongJunBallModel.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStackIn.pop();
    }
    /*@Override
    public void render(DongJunBall entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.push();
        matrixStackIn.scale(0.5F, 0.5F, 0.5F);
        Matrix4f matrix4f = matrixStackIn.getLast().getMatrix();

        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(this.dongJunBallModel.getRenderType(this.getEntityTexture(entityIn)));

        ivertexbuilder.pos(matrix4f,  -1, -1, 0).overlay(1, 1).endVertex();
        ivertexbuilder.pos(matrix4f,  -1, 1, 0).overlay(1, 0).endVertex();
        ivertexbuilder.pos(matrix4f,  1, 1, 0).overlay(0, 0).endVertex();
        ivertexbuilder.pos(matrix4f,  1, -1, 0).overlay(0, 1).endVertex();
        matrixStackIn.pop();
    }*/

    /*@Override
    public void render(DongJunBall entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        matrixStackIn.push();
        matrixStackIn.scale(2.0F, 2.0F, 2.0F);
        matrixStackIn.rotate(this.renderManager.getCameraOrientation());
        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F));
        MatrixStack.Entry matrixstack$entry = matrixStackIn.getLast();
        Matrix4f matrix4f = matrixstack$entry.getMatrix();
        Matrix3f matrix3f = matrixstack$entry.getNormal();
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(this.dongJunBallModel.getRenderType(this.getEntityTexture(entityIn)));
        func_229045_a_(ivertexbuilder, matrix4f, matrix3f, packedLightIn, 0.0F, 0, 0, 1);
        func_229045_a_(ivertexbuilder, matrix4f, matrix3f, packedLightIn, 1.0F, 0, 1, 1);
        func_229045_a_(ivertexbuilder, matrix4f, matrix3f, packedLightIn, 1.0F, 1, 1, 0);
        func_229045_a_(ivertexbuilder, matrix4f, matrix3f, packedLightIn, 0.0F, 1, 0, 0);
        matrixStackIn.pop();
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    private static void func_229045_a_(IVertexBuilder p_229045_0_, Matrix4f p_229045_1_, Matrix3f p_229045_2_, int p_229045_3_, float p_229045_4_, int p_229045_5_, int p_229045_6_, int p_229045_7_) {
        p_229045_0_.pos(p_229045_1_, p_229045_4_ - 0.5F, (float)p_229045_5_ - 0.25F, 0.0F).color(255, 255, 255, 255).tex((float)p_229045_6_, (float)p_229045_7_).overlay(OverlayTexture.NO_OVERLAY).lightmap(p_229045_3_).normal(p_229045_2_, 0.0F, 1.0F, 0.0F).endVertex();
    }*/

}
