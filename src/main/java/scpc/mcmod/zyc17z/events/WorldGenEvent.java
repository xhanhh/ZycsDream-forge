package scpc.mcmod.zyc17z.events;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import scpc.mcmod.zyc17z.ZycMod;
import scpc.mcmod.zyc17z.world.ZycGrassGen;

@Mod.EventBusSubscriber(modid = ZycMod.MOD_ID)
public class WorldGenEvent {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        ZycGrassGen.genGrass(event);

    }

}
