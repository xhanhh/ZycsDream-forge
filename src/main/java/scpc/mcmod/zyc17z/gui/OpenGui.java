package scpc.mcmod.zyc17z.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TranslationTextComponent;
import scpc.mcmod.zyc17z.ZycMod;

public class OpenGui {

    public OpenGui() {
        Minecraft.getInstance().displayGuiScreen(new ZycFoodGui(new TranslationTextComponent(ZycMod.MOD_ID + ".test")));
    }

}
