package net.sakurababochka.a_postknight_mod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> WALNUT_PLACED = PlacementUtils.register("walnut_placed",
            ModConfiguredFeatures.WALNUT_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));

    public static final Holder<PlacedFeature> MAPLE_PLACED = PlacementUtils.register("maple_placed",
            ModConfiguredFeatures.MAPLE_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));

    public static final Holder<PlacedFeature> FROZEN_FIR_PLACED = PlacementUtils.register("frozen_fir_placed",
            ModConfiguredFeatures.FROZEN_FIR_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));

    public static final Holder<PlacedFeature> CYPRESS_PLACED = PlacementUtils.register("cypress_placed",
            ModConfiguredFeatures.CYPRESS_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));

    public static final Holder<PlacedFeature> CORAL_PLACED = PlacementUtils.register("coral_placed",
            ModConfiguredFeatures.CORAL_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));



    public static final Holder<PlacedFeature> CERULEAF_PLACED = PlacementUtils.register("ceruleaf_placed",
            ModConfiguredFeatures.CERULEAF, RarityFilter.onAverageOnceEvery(8),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> PUFFWORT_PLACED = PlacementUtils.register("puffwort_placed",
            ModConfiguredFeatures.PUFFWORT, RarityFilter.onAverageOnceEvery(12),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> SAGE_PLACED = PlacementUtils.register("sage_placed",
            ModConfiguredFeatures.SAGE, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> LOW_MALLOW_PLACED = PlacementUtils.register("low_mallow_placed",
            ModConfiguredFeatures.LOW_MALLOW, RarityFilter.onAverageOnceEvery(8),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> ROTASEED_PLACED = PlacementUtils.register("rotaseed_placed",
            ModConfiguredFeatures.ROTASEED, RarityFilter.onAverageOnceEvery(12),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> VALLEY_BELLS_PLACED = PlacementUtils.register("valley_bells_placed",
            ModConfiguredFeatures.VALLEY_BELLS, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> KUROOT_PLACED = PlacementUtils.register("kuroot_placed",
            ModConfiguredFeatures.KUROOT, RarityFilter.onAverageOnceEvery(8),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> FORESIGHT_FRUIT_PLACED = PlacementUtils.register("foresight_fruit_placed",
            ModConfiguredFeatures.FORESIGHT_FRUIT, RarityFilter.onAverageOnceEvery(12),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> GOLDEN_BASIL_PLACED = PlacementUtils.register("golden_basil_placed",
            ModConfiguredFeatures.GOLDEN_BASIL, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> EVERCHERRY_PLACED = PlacementUtils.register("evercherry_placed",
            ModConfiguredFeatures.EVERCHERRY, RarityFilter.onAverageOnceEvery(8),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> INVIGOROOT_PLACED = PlacementUtils.register("invigoroot_placed",
            ModConfiguredFeatures.INVIGOROOT, RarityFilter.onAverageOnceEvery(12),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> NIGHTLIGHT_CAP_PLACED = PlacementUtils.register("nightlight_cap_placed",
            ModConfiguredFeatures.NIGHTLIGHT_CAP, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> TINGLETOE_PLACED = PlacementUtils.register("tingletoe_placed",
            ModConfiguredFeatures.TINGLETOE, RarityFilter.onAverageOnceEvery(8),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> WINTERMINT_PLACED = PlacementUtils.register("wintermint_placed",
            ModConfiguredFeatures.WINTERMINT, RarityFilter.onAverageOnceEvery(12),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> AFLOE_VERA_PLACED = PlacementUtils.register("afloe_vera_placed",
            ModConfiguredFeatures.AFLOE_VERA, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> BRIGHTFERN_PLACED = PlacementUtils.register("brightfern_placed",
            ModConfiguredFeatures.BRIGHTFERN, RarityFilter.onAverageOnceEvery(8),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> HARDTHORN_PLACED = PlacementUtils.register("hardthorn_placed",
            ModConfiguredFeatures.HARDTHORN, RarityFilter.onAverageOnceEvery(12),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> DYNAPOD_PLACED = PlacementUtils.register("dynapod_placed",
            ModConfiguredFeatures.DYNAPOD, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> SOURBULB_PLACED = PlacementUtils.register("sourbulb_placed",
            ModConfiguredFeatures.SOURBULB, RarityFilter.onAverageOnceEvery(8),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> AZURE_PEA_PLACED = PlacementUtils.register("azure_pea_placed",
            ModConfiguredFeatures.AZURE_PEA, RarityFilter.onAverageOnceEvery(12),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> RARENANA_PLACED = PlacementUtils.register("rarenana_placed",
            ModConfiguredFeatures.RARENANA, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> SEA_DATES_PLACED = PlacementUtils.register("sea_dates_placed",
            ModConfiguredFeatures.SEA_DATES, RarityFilter.onAverageOnceEvery(8),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> OASIS_GRAPES_PLACED = PlacementUtils.register("oasis_grapes_placed",
            ModConfiguredFeatures.OASIS_GRAPES, RarityFilter.onAverageOnceEvery(12),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> CACTOPUS_POD_PLACED = PlacementUtils.register("cactopus_pod_placed",
            ModConfiguredFeatures.CACTOPUS_POD, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());



    public static final Holder<PlacedFeature> BRONZE_ORE_PLACED = PlacementUtils.register("bronze_ore_placed",
            ModConfiguredFeatures.BRONZE_ORE, ModOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(100))));

    public static final Holder<PlacedFeature> SILVER_ORE_PLACED = PlacementUtils.register("silver_ore_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOrePlacement.commonOrePlacement(9,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-30), VerticalAnchor.aboveBottom(70))));

    public static final Holder<PlacedFeature> PLATINUM_ORE_PLACED = PlacementUtils.register("platinum_ore_placed",
            ModConfiguredFeatures.PLATINUM_ORE, ModOrePlacement.commonOrePlacement(8,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(50))));

    public static final Holder<PlacedFeature> DRAGONITE_ORE_PLACED = PlacementUtils.register("dragonite_ore_placed",
            ModConfiguredFeatures.DRAGONITE_ORE, ModOrePlacement.commonOrePlacement(8,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-70), VerticalAnchor.aboveBottom(20))));
}
