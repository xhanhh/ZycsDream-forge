package scpc.mcmod.zyc17z.items.tools;

import net.minecraft.item.SwordItem;
import scpc.mcmod.zyc17z.ZycMod;
import scpc.mcmod.zyc17z.items.tools.tiers.ZycTier;

public class ZycSword extends SwordItem {

    public ZycSword() {

        super(ZycTier.ZYC_TIER, 3, 250F, new Properties().group(ZycMod.itemGroup));

    }

}
