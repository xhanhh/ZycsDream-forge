package scpc.mcmod.zyc17z.paintings;

import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import scpc.mcmod.zyc17z.ZycMod;

public class PaintingInit {

    public static final DeferredRegister<PaintingType> PAINTING_TYPE = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, ZycMod.MOD_ID);

    public static final RegistryObject<PaintingType> DisdainfulZyc = PAINTING_TYPE.register("disdainful_zyc",
            () -> new PaintingType(300, 200));

}
