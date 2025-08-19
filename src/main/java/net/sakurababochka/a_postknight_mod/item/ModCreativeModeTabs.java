package net.sakurababochka.a_postknight_mod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab POSTKNIGHT_RESOURCE_TAB = new CreativeModeTab("postknight_resources") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_BRONZE.get());
        }
    };

    public static final CreativeModeTab POSTKNIGHT_SPAWN_EGG_TAB = new CreativeModeTab("postknight_spawn_eggs") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_BRONZE.get());
        }
    };

    public static final CreativeModeTab POSTKNIGHT_EQUIPMENT_TAB = new CreativeModeTab("postknight_equipment") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_BRONZE.get());
        }
    };
}
