package scpc.mcmod.zyc17z.items;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import scpc.mcmod.zyc17z.ZycMod;
import scpc.mcmod.zyc17z.blocks.BlockInit;
import scpc.mcmod.zyc17z.items.foods.FengFood;
import scpc.mcmod.zyc17z.items.foods.ZycFood;
import scpc.mcmod.zyc17z.items.tools.ZycPickaxe;
import scpc.mcmod.zyc17z.items.tools.ZycSword;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ZycMod.MOD_ID);

    public static final RegistryObject<Item> Zyc_food = ITEMS.register("zyc_food", ZycFood::new);
    public static final RegistryObject<Item> feng_food = ITEMS.register("feng_food", FengFood::new);

    public static final RegistryObject<Item> Smelly_essence = ITEMS.register("smelly_essence", SmellyEssence::new);
    public static final RegistryObject<Item> Zyc_grass_element = ITEMS.register("zyc_grass_element", ZycGrassElement::new);

    public static final RegistryObject<Item> dongjun_ball_item = ITEMS.register("dongjun_ball_item", DongJunBallItem::new);

    public static final RegistryObject<Item> zyc_pickaxe = ITEMS.register("zyc_pickaxe", ZycPickaxe::new);
    public static final RegistryObject<Item> zyc_sword = ITEMS.register("zyc_sword", ZycSword::new);

    public static final RegistryObject<Item> ekac = ITEMS.register("ekac",
            () -> new BlockItem(BlockInit.ekac.get(), new Item.Properties().group(ZycMod.itemGroup)));
    public static final RegistryObject<Item> Zyc_block = ITEMS.register("zyc_block",
            () -> new BlockItem(BlockInit.ZycBlock.get(), new Item.Properties().group(ZycMod.itemGroup)));
    public static final RegistryObject<Item> ZycGrass = ITEMS.register("zyc_grass",
            () -> new BlockItem(BlockInit.ZycGrass.get(), new Item.Properties()));

    public static final RegistryObject<Item> CompressZycBlock_ii = ITEMS.register("compress_zyc_block_ii",
            () -> new BlockItem(BlockInit.CompressZycBlock_ii.get(), new Item.Properties().group(ZycMod.itemGroup)));
    public static final RegistryObject<Item> CompressZycBlock_iii = ITEMS.register("compress_zyc_block_iii",
            () -> new BlockItem(BlockInit.CompressZycBlock_iii.get(), new Item.Properties().group(ZycMod.itemGroup)));
    public static final RegistryObject<Item> CompressZycBlock_iv = ITEMS.register("compress_zyc_block_iv",
            () -> new BlockItem(BlockInit.CompressZycBlock_iv.get(), new Item.Properties().group(ZycMod.itemGroup)));
    public static final RegistryObject<Item> CompressZycBlock_v = ITEMS.register("compress_zyc_block_v",
            () -> new BlockItem(BlockInit.CompressZycBlock_v.get(), new Item.Properties().group(ZycMod.itemGroup)));
    public static final RegistryObject<Item> CompressZycBlock_vi = ITEMS.register("compress_zyc_block_vi",
            () -> new BlockItem(BlockInit.CompressZycBlock_vi.get(), new Item.Properties().group(ZycMod.itemGroup)));
    public static final RegistryObject<Item> CompressZycBlock_vii = ITEMS.register("compress_zyc_block_vii",
            () -> new BlockItem(BlockInit.CompressZycBlock_vii.get(), new Item.Properties().group(ZycMod.itemGroup)));
    public static final RegistryObject<Item> CompressZycBlock_viii = ITEMS.register("compress_zyc_block_viii",
            () -> new BlockItem(BlockInit.CompressZycBlock_viii.get(), new Item.Properties().group(ZycMod.itemGroup)));


}
