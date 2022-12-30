package scpc.mcmod.zyc17z.items.foods;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import scpc.mcmod.zyc17z.ZycMod;
import scpc.mcmod.zyc17z.gui.OpenGui;

import java.util.Random;

public class ZycFood extends Item {

    private Logger logger = LogManager.getLogger();

    private static final Food food = (new Food.Builder())
            .saturation(1)
            .hunger(2)
            .build();

    public ZycFood() {

        super(new Properties().food(food).group(ZycMod.itemGroup));

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        Random random = new Random();
        int randomNum = random.nextInt(10);

        if (randomNum >= 6) {

            if (worldIn.isRemote) {
                DistExecutor.safeCallWhenOn(Dist.CLIENT, () -> OpenGui::new);
                logger.debug("Open ZycFoodGui success.");
            }

        }
            return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}
