package scpc.mcmod.zyc17z.blocks.ornament.compress;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class CompressZycBlock_vi extends Block {

    public CompressZycBlock_vi() {

        super(Properties.create(Material.ROCK).hardnessAndResistance(47.5F).harvestLevel(5));

    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stackIn, @Nullable IBlockReader readerIn, List<ITextComponent> tooltip,
                               ITooltipFlag tooltipFlagIn) {

        tooltip.add(new TranslationTextComponent("tooltip.zycsdream.compress_zyc_block_vi"));

    }

}
