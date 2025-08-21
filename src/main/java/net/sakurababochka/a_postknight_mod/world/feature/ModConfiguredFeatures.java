package net.sakurababochka.a_postknight_mod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.sakurababochka.a_postknight_mod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

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
