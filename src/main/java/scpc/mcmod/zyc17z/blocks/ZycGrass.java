package scpc.mcmod.zyc17z.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.potion.Effects;

public class ZycGrass extends FlowerBlock {
    public ZycGrass() {
        super(Effects.HASTE, 5, AbstractBlock.Properties.from(Blocks.DANDELION));
    }
}
