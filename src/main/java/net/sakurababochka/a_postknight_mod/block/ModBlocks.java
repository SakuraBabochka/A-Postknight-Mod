package net.sakurababochka.a_postknight_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sakurababochka.a_postknight_mod.APostknightMod;
import net.sakurababochka.a_postknight_mod.block.custom.ModFlammableRotatedPillarBlock;
import net.sakurababochka.a_postknight_mod.item.ModCreativeModeTabs;
import net.sakurababochka.a_postknight_mod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, APostknightMod.MOD_ID);

    //Metal
    public static final RegistryObject<Block> BRONZE_ORE = registerBlock("bronze_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> DEEPSLATE_BRONZE_ORE = registerBlock("deepslate_bronze_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> DRAGONITE_ORE = registerBlock("dragonite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> DEEPSLATE_DRAGONITE_ORE = registerBlock("deepslate_dragonite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(8f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> RAW_DRAGONITE_BLOCK = registerBlock("raw_dragonite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(12f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> DRAGONITE_BLOCK = registerBlock("dragonite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(12f).requiresCorrectToolForDrops()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    //Wood
    public static final RegistryObject<Block> WALNUT_LOG = registerBlock("walnut_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> WALNUT_WOOD = registerBlock("walnut_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> STRIPPED_WALNUT_LOG = registerBlock("stripped_walnut_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> STRIPPED_WALNUT_WOOD = registerBlock("stripped_walnut_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> WALNUT_PLANKS = registerBlock("walnut_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
        @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return true;
        }
        @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 20;
        }
        @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
            return 5;
        }
            }, ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> FROZEN_FIR_LOG = registerBlock("frozen_fir_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FROZEN_FIR_WOOD = registerBlock("frozen_fir_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> STRIPPED_FROZEN_FIR_LOG = registerBlock("stripped_frozen_fir_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> STRIPPED_FROZEN_FIR_WOOD = registerBlock("stripped_frozen_fir_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FROZEN_FIR_PLANKS = registerBlock("frozen_fir_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> CYPRESS_LOG = registerBlock("cypress_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CYPRESS_WOOD = registerBlock("cypress_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> STRIPPED_CYPRESS_LOG = registerBlock("stripped_cypress_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> STRIPPED_CYPRESS_WOOD = registerBlock("stripped_cypress_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CYPRESS_PLANKS = registerBlock("cypress_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> CORAL_LOG = registerBlock("coral_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CORAL_WOOD = registerBlock("coral_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> STRIPPED_CORAL_LOG = registerBlock("stripped_coral_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> STRIPPED_CORAL_WOOD = registerBlock("stripped_coral_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CORAL_PLANKS = registerBlock("coral_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
