package net.sakurababochka.a_postknight_mod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sakurababochka.a_postknight_mod.block.ModBlocks;
import net.sakurababochka.a_postknight_mod.block.entity.ModBlockEntities;
import net.sakurababochka.a_postknight_mod.block.entity.ModWoodTypes;
import net.sakurababochka.a_postknight_mod.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(APostknightMod.MOD_ID)
public class APostknightMod
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "a_postknight_mod";

    public APostknightMod()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModBlockEntities.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WALNUT_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WALNUT_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FROZEN_FIR_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FROZEN_FIR_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYPRESS_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYPRESS_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CORAL_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CORAL_TRAPDOOR.get(), RenderType.cutout());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WALNUT_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WALNUT_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FROZEN_FIR_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FROZEN_FIR_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYPRESS_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYPRESS_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CORAL_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CORAL_LEAVES.get(), RenderType.cutout());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CERULEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_CERULEAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PUFFWORT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_PUFFWORT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_SAGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LOW_MALLOW.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_LOW_MALLOW.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ROTASEED.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_ROTASEED.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VALLEY_BELLS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_VALLEY_BELLS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.KUROOT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_KUROOT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FORESIGHT_FRUIT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_FORESIGHT_FRUIT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLDEN_BASIL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_GOLDEN_BASIL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EVERCHERRY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_EVERCHERRY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.INVIGOROOT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_INVIGOROOT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NIGHTLIGHT_CAP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_NIGHTLIGHT_CAP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINGLETOE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_TINGLETOE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WINTERMINT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_WINTERMINT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.AFLOE_VERA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_AFLOE_VERA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BRIGHTFERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_BRIGHTFERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HARDTHORN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_HARDTHORN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DYNAPOD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_DYNAPOD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOURBULB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_SOURBULB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.AZURE_PEA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_AZURE_PEA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RARENANA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_RARENANA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SEA_DATES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_SEA_DATES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OASIS_GRAPES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_OASIS_GRAPES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CACTOPUS_POD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_CACTOPUS_POD.get(), RenderType.cutout());


        WoodType.register(ModWoodTypes.WALNUT);
        WoodType.register(ModWoodTypes.MAPLE);
        WoodType.register(ModWoodTypes.FROZEN_FIR);
        WoodType.register(ModWoodTypes.CYPRESS);
        WoodType.register(ModWoodTypes.CORAL);
        BlockEntityRenderers.register(ModBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("A Postknight Mod loaded.");
        LOGGER.info("If this system is correctly functioning, the following will display the ID of a Bronze Nugget: {}", ModItems.BRONZE_NUGGET.get().getRegistryName());
        event.enqueueWork(() -> {
            Sheets.addWoodType(ModWoodTypes.WALNUT);
            Sheets.addWoodType(ModWoodTypes.MAPLE);
            Sheets.addWoodType(ModWoodTypes.FROZEN_FIR);
            Sheets.addWoodType(ModWoodTypes.CYPRESS);
            Sheets.addWoodType(ModWoodTypes.CORAL);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CERULEAF.getId(), ModBlocks.POTTED_CERULEAF);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PUFFWORT.getId(), ModBlocks.POTTED_PUFFWORT);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SAGE.getId(), ModBlocks.POTTED_SAGE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LOW_MALLOW.getId(), ModBlocks.POTTED_LOW_MALLOW);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ROTASEED.getId(), ModBlocks.POTTED_ROTASEED);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VALLEY_BELLS.getId(), ModBlocks.POTTED_VALLEY_BELLS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.KUROOT.getId(), ModBlocks.POTTED_KUROOT);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FORESIGHT_FRUIT.getId(), ModBlocks.POTTED_FORESIGHT_FRUIT);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GOLDEN_BASIL.getId(), ModBlocks.POTTED_GOLDEN_BASIL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.EVERCHERRY.getId(), ModBlocks.POTTED_EVERCHERRY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.INVIGOROOT.getId(), ModBlocks.POTTED_INVIGOROOT);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.NIGHTLIGHT_CAP.getId(), ModBlocks.POTTED_NIGHTLIGHT_CAP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.TINGLETOE.getId(), ModBlocks.POTTED_TINGLETOE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WINTERMINT.getId(), ModBlocks.POTTED_WINTERMINT);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AFLOE_VERA.getId(), ModBlocks.POTTED_AFLOE_VERA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BRIGHTFERN.getId(), ModBlocks.POTTED_BRIGHTFERN);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.HARDTHORN.getId(), ModBlocks.POTTED_HARDTHORN);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DYNAPOD.getId(), ModBlocks.POTTED_DYNAPOD);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SOURBULB.getId(), ModBlocks.POTTED_SOURBULB);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AZURE_PEA.getId(), ModBlocks.POTTED_AZURE_PEA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RARENANA.getId(), ModBlocks.POTTED_RARENANA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SEA_DATES.getId(), ModBlocks.POTTED_SEA_DATES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.OASIS_GRAPES.getId(), ModBlocks.POTTED_OASIS_GRAPES);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CACTOPUS_POD.getId(), ModBlocks.POTTED_CACTOPUS_POD);
        });
    }
}
