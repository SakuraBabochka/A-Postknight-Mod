package net.sakurababochka.a_postknight_mod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.sakurababochka.a_postknight_mod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> WALNUT_TREE =
            FeatureUtils.register("walnut", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.WALNUT_LOG.get()),
                    new ForkingTrunkPlacer(5,6,3),
                    BlockStateProvider.simple(ModBlocks.WALNUT_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2),ConstantInt.of(0),4),
                    new TwoLayersFeatureSize(1,0,2)).build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MAPLE_TREE =
            FeatureUtils.register("maple", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.MAPLE_LOG.get()),
                    new StraightTrunkPlacer(5,6,3),
                    BlockStateProvider.simple(ModBlocks.MAPLE_LEAVES.get()),
                    new SpruceFoliagePlacer(ConstantInt.of(2),ConstantInt.of(0),ConstantInt.of(4)),
                    new TwoLayersFeatureSize(1,0,2)).build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FROZEN_FIR_TREE =
            FeatureUtils.register("frozen_fir", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.FROZEN_FIR_LOG.get()),
                    new StraightTrunkPlacer(5,6,3),
                    BlockStateProvider.simple(ModBlocks.FROZEN_FIR_LEAVES.get()),
                    new SpruceFoliagePlacer(ConstantInt.of(2),ConstantInt.of(0),ConstantInt.of(4)),
                    new TwoLayersFeatureSize(1,0,2)).build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CYPRESS_TREE =
            FeatureUtils.register("cypress", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.CYPRESS_LOG.get()),
                    new StraightTrunkPlacer(5,6,3),
                    BlockStateProvider.simple(ModBlocks.CYPRESS_LEAVES.get()),
                    new DarkOakFoliagePlacer(ConstantInt.of(2),ConstantInt.of(0)),
                    new TwoLayersFeatureSize(1,0,2)).build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CORAL_TREE =
            FeatureUtils.register("coral", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.CORAL_LOG.get()),
                    new FancyTrunkPlacer(5,6,3),
                    BlockStateProvider.simple(ModBlocks.CORAL_LEAVES.get()),
                    new AcaciaFoliagePlacer(ConstantInt.of(2),ConstantInt.of(1)),
                    new TwoLayersFeatureSize(1,0,2)).dirt(BlockStateProvider.simple(Blocks.SAND)).build());



    public static final Holder<PlacedFeature> WALNUT_CHECKED =
            PlacementUtils.register("walnut_checked", WALNUT_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.WALNUT_SAPLING.get()));

    public static final Holder<PlacedFeature> MAPLE_CHECKED =
            PlacementUtils.register("maple_checked", MAPLE_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.MAPLE_SAPLING.get()));

    public static final Holder<PlacedFeature> FROZEN_FIR_CHECKED =
            PlacementUtils.register("frozen_fir_checked", FROZEN_FIR_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.FROZEN_FIR_SAPLING.get()));

    public static final Holder<PlacedFeature> CYPRESS_CHECKED =
            PlacementUtils.register("cypress_checked", CYPRESS_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.CYPRESS_SAPLING.get()));

    public static final Holder<PlacedFeature> CORAL_CHECKED =
            PlacementUtils.register("coral_checked", CORAL_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.CORAL_SAPLING.get()));



    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> WALNUT_SPAWN =
            FeatureUtils.register("walnut_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(WALNUT_CHECKED,
                            0.5F)), WALNUT_CHECKED));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MAPLE_SPAWN =
            FeatureUtils.register("maple_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MAPLE_CHECKED,
                            0.5F)), MAPLE_CHECKED));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> FROZEN_FIR_SPAWN =
            FeatureUtils.register("frozen_fir_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(FROZEN_FIR_CHECKED,
                            0.5F)), FROZEN_FIR_CHECKED));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> CYPRESS_SPAWN =
            FeatureUtils.register("cypress_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(CYPRESS_CHECKED,
                            0.5F)), CYPRESS_CHECKED));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> CORAL_SPAWN =
            FeatureUtils.register("coral_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(CORAL_CHECKED,
                            0.5F)), CORAL_CHECKED));



    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CERULEAF =
            FeatureUtils.register("flower_ceruleaf", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CERULEAF.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PUFFWORT =
            FeatureUtils.register("flower_puffwort", Feature.FLOWER,
                    new RandomPatchConfiguration(24, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PUFFWORT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> SAGE =
            FeatureUtils.register("flower_sage", Feature.FLOWER,
                    new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SAGE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> LOW_MALLOW =
            FeatureUtils.register("flower_low_mallow", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LOW_MALLOW.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> ROTASEED =
            FeatureUtils.register("flower_rotaseed", Feature.FLOWER,
                    new RandomPatchConfiguration(24, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ROTASEED.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> VALLEY_BELLS =
            FeatureUtils.register("flower_valley_bells", Feature.FLOWER,
                    new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.VALLEY_BELLS.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> KUROOT =
            FeatureUtils.register("flower_kuroot", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.KUROOT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FORESIGHT_FRUIT =
            FeatureUtils.register("flower_foresight_frut", Feature.FLOWER,
                    new RandomPatchConfiguration(24, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.FORESIGHT_FRUIT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> GOLDEN_BASIL =
            FeatureUtils.register("flower_golden_basil", Feature.FLOWER,
                    new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GOLDEN_BASIL.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> EVERCHERRY =
            FeatureUtils.register("flower_evercherry", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.EVERCHERRY.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> INVIGOROOT =
            FeatureUtils.register("flower_invigoroot", Feature.FLOWER,
                    new RandomPatchConfiguration(24, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.INVIGOROOT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> NIGHTLIGHT_CAP =
            FeatureUtils.register("flower_nightlight_cap", Feature.FLOWER,
                    new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.NIGHTLIGHT_CAP.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> TINGLETOE =
            FeatureUtils.register("flower_tingletoe", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.TINGLETOE.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> WINTERMINT =
            FeatureUtils.register("flower_wintermint", Feature.FLOWER,
                    new RandomPatchConfiguration(24, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WINTERMINT.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> AFLOE_VERA =
            FeatureUtils.register("flower_afloe_vera", Feature.FLOWER,
                    new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.AFLOE_VERA.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> BRIGHTFERN =
            FeatureUtils.register("flower_brightfern", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BRIGHTFERN.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HARDTHORN =
            FeatureUtils.register("flower_hardthorn", Feature.FLOWER,
                    new RandomPatchConfiguration(24, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARDTHORN.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DYNAPOD =
            FeatureUtils.register("flower_dynapod", Feature.FLOWER,
                    new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.DYNAPOD.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> SOURBULB =
            FeatureUtils.register("flower_sourbulb", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SOURBULB.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> AZURE_PEA =
            FeatureUtils.register("flower_azure_pea", Feature.FLOWER,
                    new RandomPatchConfiguration(24, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.AZURE_PEA.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> RARENANA =
            FeatureUtils.register("flower_rarenana", Feature.FLOWER,
                    new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RARENANA.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> SEA_DATES =
            FeatureUtils.register("flower_sea_dates", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SEA_DATES.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> OASIS_GRAPES =
            FeatureUtils.register("flower_oasis_grapes", Feature.FLOWER,
                    new RandomPatchConfiguration(24, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.OASIS_GRAPES.get())))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CACTOPUS_POD =
            FeatureUtils.register("flower_cactopus_pod", Feature.FLOWER,
                    new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CACTOPUS_POD.get())))));



    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BRONZE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BRONZE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BRONZE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SILVER_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PLATINUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PLATINUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_DRAGONITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.DRAGONITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_DRAGONITE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BRONZE_ORE = FeatureUtils.register("bronze_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_BRONZE_ORES, 10));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE = FeatureUtils.register("silver_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES, 8));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PLATINUM_ORE = FeatureUtils.register("platinum_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PLATINUM_ORES, 6));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DRAGONITE_ORE = FeatureUtils.register("dragonite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_DRAGONITE_ORES, 5));
}
