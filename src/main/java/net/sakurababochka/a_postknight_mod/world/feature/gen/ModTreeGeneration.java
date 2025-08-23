package net.sakurababochka.a_postknight_mod.world.feature.gen;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.sakurababochka.a_postknight_mod.world.feature.ModPlacedFeatures;

import java.util.List;
import java.util.Set;

public class ModTreeGeneration {
    public static void generateTrees(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.FOREST)) {
            if (types.contains(BiomeDictionary.Type.JUNGLE)) {}
            else {
                List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

                base.add(ModPlacedFeatures.WALNUT_PLACED);}
        }
        if (types.contains(BiomeDictionary.Type.SWAMP)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.MAPLE_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.CONIFEROUS)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.FROZEN_FIR_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.JUNGLE)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.CYPRESS_PLACED);
        }
        if (types.contains(BiomeDictionary.Type.DRY)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.CORAL_PLACED);
        }
    }
}
