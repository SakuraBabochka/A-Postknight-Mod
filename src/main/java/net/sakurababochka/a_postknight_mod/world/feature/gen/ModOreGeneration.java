package net.sakurababochka.a_postknight_mod.world.feature.gen;

import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.sakurababochka.a_postknight_mod.world.feature.ModPlacedFeatures;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.BRONZE_ORE_PLACED);
        base.add(ModPlacedFeatures.SILVER_ORE_PLACED);
        base.add(ModPlacedFeatures.PLATINUM_ORE_PLACED);
        base.add(ModPlacedFeatures.DRAGONITE_ORE_PLACED);
    }
}
