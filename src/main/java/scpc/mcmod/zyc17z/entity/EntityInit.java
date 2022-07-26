package scpc.mcmod.zyc17z.entity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import scpc.mcmod.zyc17z.ZycMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityInit {

    public static final DeferredRegister EntityRegister = DeferredRegister.create(ForgeRegistries.ENTITIES, ZycMod.MOD_ID);

    public static final EntityType<DongJunBall> DONGJUN_BALL = EntityType.Builder.<DongJunBall>create(DongJunBall::new, EntityClassification.MISC).size(0.25F,
            0.25F).trackingRange(4).func_233608_b_(10).build("dongjun_ball");

    //public static final RegistryObject<EntityType<DongJunBall>> dongjun_ball = EntityRegister.register("dongjun_ball",
    // () ->  EntityType.Builder.<DongJunBall>create(DongJunBall::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).func_233608_b_(10));
}




