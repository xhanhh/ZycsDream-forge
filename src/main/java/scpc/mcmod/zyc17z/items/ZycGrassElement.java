package scpc.mcmod.zyc17z.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import scpc.mcmod.zyc17z.ZycMod;

import javax.annotation.Nullable;
import java.util.List;

public class ZycGrassElement extends Item {

    public ZycGrassElement() {
        super(new Properties().group(ZycMod.itemGroup));
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("tooltip.zycsdream.grass_element"));
        } else {
            tooltip.add(new TranslationTextComponent("tooltip.zycsdream.shift_tip"));
        }

    }

}
