package scpc.mcmod.zyc17z.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import scpc.mcmod.zyc17z.ZycMod;
import scpc.mcmod.zyc17z.items.tools.tiers.ZycTier;

public class ZycPickaxe extends PickaxeItem {

    public ZycPickaxe() {

        super(ZycTier.ZYC_TIER, -1250, 99999999999999999999999999999999999999.9F, (new Item.Properties()).group(ZycMod.itemGroup));

    }

}
