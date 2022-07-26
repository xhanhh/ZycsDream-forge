package scpc.mcmod.zyc17z.world;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import scpc.mcmod.zyc17z.blocks.BlockInit;

public class ZycFeatures {

    public static final ConfiguredFeature<?, ?> ZYC_GRASS_FOREST = Feature.FLOWER.withConfiguration(
            (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.ZycGrass.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(64).build()).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242731_b(9);

    public static final ConfiguredFeature<?, ?> ZYC_GRASS_PLAIN = Feature.FLOWER.withConfiguration(
                    (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.ZycGrass.get().getDefaultState()),
                            SimpleBlockPlacer.PLACER)).tries(18).build()).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                            .func_242731_b(2);

    public static final ConfiguredFeature<?, ?> ZYC_GRASS_SWAMP = Feature.FLOWER.withConfiguration(
                    (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.ZycGrass.get().getDefaultState()),
                            SimpleBlockPlacer.PLACER)).tries(64).build()).withPlacement(Features.Placements.VEGETATION_PLACEMENT)
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242731_b(5);

}
