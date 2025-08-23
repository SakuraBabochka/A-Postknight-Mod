package net.sakurababochka.a_postknight_mod.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sakurababochka.a_postknight_mod.APostknightMod;
import net.sakurababochka.a_postknight_mod.world.feature.gen.ModFlowerGeneration;
import net.sakurababochka.a_postknight_mod.world.feature.gen.ModOreGeneration;
import net.sakurababochka.a_postknight_mod.world.feature.gen.ModTreeGeneration;

@Mod.EventBusSubscriber(modid = APostknightMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        
        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);
    }
}
