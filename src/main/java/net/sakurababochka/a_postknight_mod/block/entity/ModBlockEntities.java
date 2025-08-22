package net.sakurababochka.a_postknight_mod.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sakurababochka.a_postknight_mod.APostknightMod;
import net.sakurababochka.a_postknight_mod.block.ModBlocks;
import net.sakurababochka.a_postknight_mod.block.entity.custom.ModSignBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, APostknightMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.WALNUT_WALL_SIGN.get(),
                            ModBlocks.WALNUT_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
