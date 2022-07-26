package scpc.mcmod.zyc17z.blocks.ekac;

import net.minecraft.block.CakeBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ekaCBlock extends CakeBlock {

    public ekaCBlock() {
        super(Properties.create(Material.CAKE));
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stackIn, @Nullable IBlockReader readerIn, List<ITextComponent> tooltip,
                               ITooltipFlag tooltipFlagIn) {

        if (Screen.hasShiftDown()) {

            tooltip.add(new TranslationTextComponent("tooltip.zycsdream.ekac"));

        } else {

            tooltip.add(new TranslationTextComponent("tooltip.zycsdream.shift_tip"));

        }

    }

}
