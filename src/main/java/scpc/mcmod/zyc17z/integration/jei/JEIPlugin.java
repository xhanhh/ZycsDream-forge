package scpc.mcmod.zyc17z.integration.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.runtime.IIngredientManager;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import scpc.mcmod.zyc17z.ZycMod;
import scpc.mcmod.zyc17z.items.ItemInit;

import javax.annotation.Nonnull;
import java.util.Collections;

@JeiPlugin
public class JEIPlugin implements IModPlugin {

    private static final ResourceLocation UID = new ResourceLocation(ZycMod.MOD_ID, "jei");

    @Override
    public ResourceLocation getPluginUid() {
        return UID;
    }

    @Override
    public void onRuntimeAvailable(@Nonnull IJeiRuntime jeiRuntime) {

        IIngredientManager iIngredientManager = jeiRuntime.getIngredientManager();
        iIngredientManager.removeIngredientsAtRuntime(VanillaTypes.ITEM, Collections.singleton(new ItemStack(ItemInit.ZycGrass.get())));

    }

}
