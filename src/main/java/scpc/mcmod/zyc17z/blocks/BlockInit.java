package scpc.mcmod.zyc17z.blocks;

import net.minecraft.block.*;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import scpc.mcmod.zyc17z.ZycMod;
import scpc.mcmod.zyc17z.blocks.ekac.ekaCBlock;
import scpc.mcmod.zyc17z.blocks.ornament.ZycBlock;
import scpc.mcmod.zyc17z.blocks.ornament.compress.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ZycMod.MOD_ID);

    public static final RegistryObject<CakeBlock> ekac = BLOCKS.register("ekac", ekaCBlock::new);

    public static final RegistryObject<Block> ZycBlock = BLOCKS.register("zyc_block", ZycBlock::new);
    public static final RegistryObject<Block> CompressZycBlock_i = BLOCKS.register("compress_zyc_block_i", CompressZycBlock_i::new);
    public static final RegistryObject<Block> CompressZycBlock_ii = BLOCKS.register("compress_zyc_block_ii", CompressZycBlock_ii::new);
    public static final RegistryObject<Block> CompressZycBlock_iii = BLOCKS.register("compress_zyc_block_iii", CompressZycBlock_iii::new);
    public static final RegistryObject<Block> CompressZycBlock_iv = BLOCKS.register("compress_zyc_block_iv", CompressZycBlock_iv::new);
    public static final RegistryObject<Block> CompressZycBlock_v = BLOCKS.register("compress_zyc_block_v", CompressZycBlock_v::new);
    public static final RegistryObject<Block> CompressZycBlock_vi = BLOCKS.register("compress_zyc_block_vi", CompressZycBlock_vi::new);
    public static final RegistryObject<Block> CompressZycBlock_vii = BLOCKS.register("compress_zyc_block_vii", CompressZycBlock_vii::new);
    public static final RegistryObject<Block> CompressZycBlock_viii = BLOCKS.register("compress_zyc_block_viii", CompressZycBlock_viii::new);


    public static final RegistryObject<Block> ZycGrass = BLOCKS.register("zyc_grass",
            () -> new FlowerBlock(Effects.HASTE, 5, AbstractBlock.Properties.from(Blocks.DANDELION)));

}
