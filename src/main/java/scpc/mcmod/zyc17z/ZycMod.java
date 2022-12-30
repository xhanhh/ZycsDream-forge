package scpc.mcmod.zyc17z;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import scpc.mcmod.zyc17z.blocks.BlockInit;
import scpc.mcmod.zyc17z.entity.EntityInit;
import scpc.mcmod.zyc17z.items.ItemInit;
import scpc.mcmod.zyc17z.paintings.PaintingInit;

@Mod(ZycMod.MOD_ID)
public class ZycMod {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "zycsdream";

    public static final ItemGroup itemGroup = new ZycTab();

    public ZycMod() {

        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        EntityInit.EntityRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
        PaintingInit.PAINTING_TYPE.register(FMLJavaModLoadingContext.get().getModEventBus());

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ZycConfig.COMMON_CONFIG);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);

    }

    public static ResourceLocation rl(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public void clientSetup(final FMLClientSetupEvent event) {

        LOGGER.info("Loading Zyc's Dream Mod.");

        event.enqueueWork(() -> {

            RenderTypeLookup.setRenderLayer(BlockInit.ZycGrass.get(), RenderType.getCutout());

                });

    }

    private void loadComplete(final FMLLoadCompleteEvent event) {

    }

    private void setup(final FMLCommonSetupEvent event) {

    }

}
