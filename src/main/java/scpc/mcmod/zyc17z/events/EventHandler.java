package scpc.mcmod.zyc17z.events;

import net.minecraft.entity.Entity;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import scpc.mcmod.zyc17z.ZycConfig;

@Mod.EventBusSubscriber
public class EventHandler {

    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinWorldEvent event) {

        Entity entity = event.getEntity();

        if (!entity.world.isRaining()) {

            if (ZycConfig.alwaysRaining.get()) {

                entity.world.setRainStrength(2.5F);

            }

        }

    }

}
