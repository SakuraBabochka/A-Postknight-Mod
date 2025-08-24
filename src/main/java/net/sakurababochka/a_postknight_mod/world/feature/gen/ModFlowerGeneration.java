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

public class ModFlowerGeneration {
    public static void generateFlowers(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(BiomeDictionary.Type.FOREST)) {
            if (types.contains(BiomeDictionary.Type.JUNGLE)) {}
            else {
                List<Holder<PlacedFeature>> base =
                        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

                base.add(ModPlacedFeatures.CERULEAF_PLACED);
                base.add(ModPlacedFeatures.PUFFWORT_PLACED);
                base.add(ModPlacedFeatures.SAGE_PLACED);

                base.add(ModPlacedFeatures.LOW_MALLOW_PLACED);
                base.add(ModPlacedFeatures.ROTASEED_PLACED);
                base.add(ModPlacedFeatures.VALLEY_BELLS_PLACED);
            }
        }

        if (types.contains(BiomeDictionary.Type.SWAMP)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.KUROOT_PLACED);
            base.add(ModPlacedFeatures.FORESIGHT_FRUIT_PLACED);
            base.add(ModPlacedFeatures.GOLDEN_BASIL_PLACED);

            base.add(ModPlacedFeatures.EVERCHERRY_PLACED);
            base.add(ModPlacedFeatures.INVIGOROOT_PLACED);
            base.add(ModPlacedFeatures.NIGHTLIGHT_CAP_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.SNOWY)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.TINGLETOE_PLACED);
            base.add(ModPlacedFeatures.WINTERMINT_PLACED);
            base.add(ModPlacedFeatures.AFLOE_VERA_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.JUNGLE)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.BRIGHTFERN_PLACED);
            base.add(ModPlacedFeatures.HARDTHORN_PLACED);
            base.add(ModPlacedFeatures.DYNAPOD_PLACED);

            base.add(ModPlacedFeatures.SOURBULB_PLACED);
            base.add(ModPlacedFeatures.AZURE_PEA_PLACED);
            base.add(ModPlacedFeatures.RARENANA_PLACED);
        }

        if (types.contains(BiomeDictionary.Type.DRY)) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(ModPlacedFeatures.SEA_DATES_PLACED);
            base.add(ModPlacedFeatures.OASIS_GRAPES_PLACED);
            base.add(ModPlacedFeatures.CACTOPUS_POD_PLACED);
        }
    }
}
