package net.sakurababochka.a_postknight_mod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sakurababochka.a_postknight_mod.APostknightMod;
import net.sakurababochka.a_postknight_mod.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, APostknightMod.MOD_ID);

    public static final RegistryObject<Item> RAW_BRONZE = ITEMS.register("raw_bronze",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB)));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB)));

    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB)));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB)));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB)));

    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB)));

    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB)));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB)));

    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB)));

    public static final RegistryObject<Item> RAW_DRAGONITE = ITEMS.register("raw_dragonite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB).fireResistant()));

    public static final RegistryObject<Item> DRAGONITE_INGOT = ITEMS.register("dragonite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB).fireResistant()));

    public static final RegistryObject<Item> DRAGONITE_NUGGET = ITEMS.register("dragonite_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB).fireResistant()));




    public static final RegistryObject<Item> WALNUT_SIGN = ITEMS.register("walnut_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB).stacksTo(16),
                    ModBlocks.WALNUT_SIGN.get(), ModBlocks.WALNUT_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAPLE_SIGN = ITEMS.register("maple_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB).stacksTo(16),
                    ModBlocks.MAPLE_SIGN.get(), ModBlocks.MAPLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> FROZEN_FIR_SIGN = ITEMS.register("frozen_fir_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB).stacksTo(16),
                    ModBlocks.FROZEN_FIR_SIGN.get(), ModBlocks.FROZEN_FIR_WALL_SIGN.get()));
    public static final RegistryObject<Item> CYPRESS_SIGN = ITEMS.register("cypress_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB).stacksTo(16),
                    ModBlocks.CYPRESS_SIGN.get(), ModBlocks.CYPRESS_WALL_SIGN.get()));
    public static final RegistryObject<Item> CORAL_SIGN = ITEMS.register("coral_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB).stacksTo(16),
                    ModBlocks.CORAL_SIGN.get(), ModBlocks.CORAL_WALL_SIGN.get()));

    public static final RegistryObject<Item> WALNUT = ITEMS.register("walnut",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
