package scpc.mcmod.zyc17z.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import scpc.mcmod.zyc17z.ZycMod;

public class ZycFoodGui extends Screen {

    ResourceLocation ZYC_GUI = ZycMod.rl("textures/gui/zyc_gui.png");
    TranslationTextComponent content = new TranslationTextComponent("gui." + ZycMod.MOD_ID + ".zyc");

    protected ZycFoodGui(ITextComponent titleIn) {
        super(titleIn);
    }

    @Override
    protected void init() {
        assert this.minecraft != null;
        this.minecraft.keyboardListener.enableRepeatEvents(true);
        super.init();
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        this.minecraft.getTextureManager().bindTexture(ZYC_GUI);
        int textureWidth = 300;
        int textureHeight = 200;
        this.blit(matrixStack, this.width / 2 -150, 30, 0, 0, 300, 200, textureWidth, textureHeight);
        drawCenteredString(matrixStack, this.font, content, this.width / 2 - 10, 90, 0xffffff);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
    }



}
