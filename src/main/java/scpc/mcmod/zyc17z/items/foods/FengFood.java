package scpc.mcmod.zyc17z.items.foods;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import scpc.mcmod.zyc17z.ZycMod;

public class FengFood extends Item {

    private static final Food food = (new Food.Builder())
            .saturation(2)
            .hunger(4)
            .build();


    public FengFood() {

        super(new Properties().food(food).group(ZycMod.itemGroup));

    }

}
