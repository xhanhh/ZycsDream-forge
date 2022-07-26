package scpc.mcmod.zyc17z.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import scpc.mcmod.zyc17z.ZycMod;
import scpc.mcmod.zyc17z.entity.DongJunBall;

import javax.annotation.Nullable;
import java.util.List;

public class DongJunBallItem extends Item {

    public DongJunBallItem() {
        super(new Properties().group(ZycMod.itemGroup));
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        worldIn.playSound(null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        if (!worldIn.isRemote) {
            DongJunBall snowballentity = new DongJunBall(worldIn, playerIn);
            snowballentity.setItem(itemstack);
            snowballentity.func_234612_a_(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
            worldIn.addEntity(snowballentity);
        }

        playerIn.addStat(Stats.ITEM_USED.get(this));
        if (!playerIn.abilities.isCreativeMode) {
            itemstack.shrink(1);
        }

        return ActionResult.func_233538_a_(itemstack, worldIn.isRemote());
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {


        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("tooltip.zycsdream.dongjun_ball"));
        } else {
            tooltip.add(new TranslationTextComponent("tooltip.zycsdream.n"));
            tooltip.add(new TranslationTextComponent("tooltip.zycsdream.throw"));
            tooltip.add(new TranslationTextComponent("tooltip.zycsdream.dongjun_ball.attack"));
            tooltip.add(new TranslationTextComponent("tooltip.zycsdream.n"));
            tooltip.add(new TranslationTextComponent("tooltip.zycsdream.shift"));
        }

    }

}
