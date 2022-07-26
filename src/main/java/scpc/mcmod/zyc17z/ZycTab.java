package scpc.mcmod.zyc17z;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import scpc.mcmod.zyc17z.items.ItemInit;

public class ZycTab extends ItemGroup {

    public ZycTab() {
        super("zyc_tab");
    }

    @Override
    public ItemStack createIcon() {

        return new ItemStack(ItemInit.Zyc_food.get());
    }

}
