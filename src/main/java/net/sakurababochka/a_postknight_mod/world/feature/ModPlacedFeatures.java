package net.sakurababochka.a_postknight_mod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
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
