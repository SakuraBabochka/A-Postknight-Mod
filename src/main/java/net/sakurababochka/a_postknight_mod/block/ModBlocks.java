package net.sakurababochka.a_postknight_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sakurababochka.a_postknight_mod.APostknightMod;
import net.sakurababochka.a_postknight_mod.block.custom.*;
import net.sakurababochka.a_postknight_mod.block.entity.ModWoodTypes;
import net.sakurababochka.a_postknight_mod.item.ModCreativeModeTabs;
import net.sakurababochka.a_postknight_mod.item.ModItems;
import net.sakurababochka.a_postknight_mod.world.feature.tree.*;

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
    public static final RegistryObject<Block> WALNUT_STAIRS = registerBlock("walnut_stairs",
            () -> new StairBlock(() -> ModBlocks.WALNUT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> WALNUT_SLAB = registerBlock("walnut_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> WALNUT_FENCE = registerBlock("walnut_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> WALNUT_FENCE_GATE = registerBlock("walnut_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)),ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> WALNUT_BUTTON = registerBlock("walnut_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> WALNUT_PRESSURE_PLATE = registerBlock("walnut_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> WALNUT_DOOR = registerBlock("walnut_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> WALNUT_TRAPDOOR = registerBlock("walnut_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> WALNUT_WALL_SIGN = registerBlockWithoutBlockItem("walnut_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WALNUT));
    public static final RegistryObject<Block> WALNUT_SIGN = registerBlockWithoutBlockItem("walnut_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.WALNUT));
    public static final RegistryObject<Block> WALNUT_LEAVES = registerBlock("walnut_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
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
    public static final RegistryObject<Block> MAPLE_STAIRS = registerBlock("maple_stairs",
            () -> new StairBlock(() -> ModBlocks.WALNUT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> MAPLE_FENCE = registerBlock("maple_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)),ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> MAPLE_BUTTON = registerBlock("maple_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> MAPLE_DOOR = registerBlock("maple_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> MAPLE_WALL_SIGN = registerBlockWithoutBlockItem("maple_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_SIGN = registerBlockWithoutBlockItem("maple_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_LEAVES = registerBlock("maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
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
    public static final RegistryObject<Block> FROZEN_FIR_STAIRS = registerBlock("frozen_fir_stairs",
            () -> new StairBlock(() -> ModBlocks.WALNUT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FROZEN_FIR_SLAB = registerBlock("frozen_fir_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FROZEN_FIR_FENCE = registerBlock("frozen_fir_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FROZEN_FIR_FENCE_GATE = registerBlock("frozen_fir_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)),ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FROZEN_FIR_BUTTON = registerBlock("frozen_fir_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FROZEN_FIR_PRESSURE_PLATE = registerBlock("frozen_fir_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FROZEN_FIR_DOOR = registerBlock("frozen_fir_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FROZEN_FIR_TRAPDOOR = registerBlock("frozen_fir_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FROZEN_FIR_WALL_SIGN = registerBlockWithoutBlockItem("frozen_fir_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.FROZEN_FIR));
    public static final RegistryObject<Block> FROZEN_FIR_SIGN = registerBlockWithoutBlockItem("frozen_fir_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.FROZEN_FIR));
    public static final RegistryObject<Block> FROZEN_FIR_LEAVES = registerBlock("frozen_fir_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
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
    public static final RegistryObject<Block> CYPRESS_STAIRS = registerBlock("cypress_stairs",
            () -> new StairBlock(() -> ModBlocks.WALNUT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CYPRESS_SLAB = registerBlock("cypress_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CYPRESS_FENCE = registerBlock("cypress_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CYPRESS_FENCE_GATE = registerBlock("cypress_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)),ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CYPRESS_BUTTON = registerBlock("cypress_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CYPRESS_PRESSURE_PLATE = registerBlock("cypress_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CYPRESS_DOOR = registerBlock("cypress_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CYPRESS_TRAPDOOR = registerBlock("cypress_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CYPRESS_WALL_SIGN = registerBlockWithoutBlockItem("cypress_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CYPRESS));
    public static final RegistryObject<Block> CYPRESS_SIGN = registerBlockWithoutBlockItem("cypress_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CYPRESS));
    public static final RegistryObject<Block> CYPRESS_LEAVES = registerBlock("cypress_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
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
    public static final RegistryObject<Block> CORAL_STAIRS = registerBlock("coral_stairs",
            () -> new StairBlock(() -> ModBlocks.WALNUT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CORAL_SLAB = registerBlock("coral_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CORAL_FENCE = registerBlock("coral_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CORAL_FENCE_GATE = registerBlock("coral_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)),ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CORAL_BUTTON = registerBlock("coral_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CORAL_PRESSURE_PLATE = registerBlock("coral_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CORAL_DOOR = registerBlock("coral_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CORAL_TRAPDOOR = registerBlock("coral_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion()), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CORAL_WALL_SIGN = registerBlockWithoutBlockItem("coral_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CORAL));
    public static final RegistryObject<Block> CORAL_SIGN = registerBlockWithoutBlockItem("coral_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CORAL));
    public static final RegistryObject<Block> CORAL_LEAVES = registerBlock("coral_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> WALNUT_SAPLING = registerBlock("walnut_sapling",
            () -> new SaplingBlock(new WalnutTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> MAPLE_SAPLING = registerBlock("maple_sapling",
            () -> new SaplingBlock(new MapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FROZEN_FIR_SAPLING = registerBlock("frozen_fir_sapling",
            () -> new SaplingBlock(new FrozenFirTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CYPRESS_SAPLING = registerBlock("cypress_sapling",
            () -> new SaplingBlock(new CypressTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CORAL_SAPLING = registerBlock("coral_sapling",
            () -> new ModSaplingBlock(new CoralTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), () -> Blocks.SAND), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);





    public static final RegistryObject<Block> CERULEAF = registerBlock("ceruleaf",
            () -> new FlowerBlock(MobEffects.LUCK, 6, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> PUFFWORT = registerBlock("puffwort",
            () -> new FlowerBlock(MobEffects.REGENERATION, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> SAGE = registerBlock("sage",
            () -> new FlowerBlock(MobEffects.SATURATION, 10, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> LOW_MALLOW = registerBlock("low_mallow",
            () -> new FlowerBlock(MobEffects.REGENERATION, 6, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> ROTASEED = registerBlock("rotaseed",
            () -> new FlowerBlock(MobEffects.SLOW_FALLING, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> VALLEY_BELLS = registerBlock("valley_bells",
            () -> new FlowerBlock(MobEffects.HEALTH_BOOST, 10, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> KUROOT = registerBlock("kuroot",
            () -> new FlowerBlock(MobEffects.CONFUSION, 6, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> FORESIGHT_FRUIT = registerBlock("foresight_fruit",
            () -> new FlowerBlock(MobEffects.NIGHT_VISION, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> GOLDEN_BASIL = registerBlock("golden_basil",
            () -> new FlowerBlock(MobEffects.HERO_OF_THE_VILLAGE, 10, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> EVERCHERRY = registerBlock("evercherry",
            () -> new FlowerBlock(MobEffects.SATURATION, 6, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> INVIGOROOT = registerBlock("invigoroot",
            () -> new FlowerBlock(MobEffects.DAMAGE_RESISTANCE, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> NIGHTLIGHT_CAP = registerBlock("nightlight_cap",
            () -> new FlowerBlock(MobEffects.POISON, 10, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> TINGLETOE = registerBlock("tingletoe",
            () -> new FlowerBlock(MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> WINTERMINT = registerBlock("wintermint",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> AFLOE_VERA = registerBlock("afloe_vera",
            () -> new FlowerBlock(MobEffects.DAMAGE_RESISTANCE, 10, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> BRIGHTFERN = registerBlock("brightfern",
            () -> new FlowerBlock(MobEffects.GLOWING, 6, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> HARDTHORN = registerBlock("hardthorn",
            () -> new FlowerBlock(MobEffects.UNLUCK, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> DYNAPOD = registerBlock("dynapod",
            () -> new FlowerBlock(MobEffects.DIG_SPEED, 10, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> SOURBULB = registerBlock("sourbulb",
            () -> new FlowerBlock(MobEffects.LUCK, 6, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> AZURE_PEA = registerBlock("azure_pea",
            () -> new FlowerBlock(MobEffects.REGENERATION, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> RARENANA = registerBlock("rarenana",
            () -> new FlowerBlock(MobEffects.HERO_OF_THE_VILLAGE, 10, BlockBehaviour.Properties.copy(Blocks.POPPY)), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> SEA_DATES = registerBlock("sea_dates",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 6, BlockBehaviour.Properties.copy(Blocks.POPPY), () -> Blocks.SAND), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> OASIS_GRAPES = registerBlock("oasis_grapes",
            () -> new ModFlowerBlock(MobEffects.LUCK, 8, BlockBehaviour.Properties.copy(Blocks.POPPY), () -> Blocks.SAND), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);
    public static final RegistryObject<Block> CACTOPUS_POD = registerBlock("cactopus_pod",
            () -> new ModFlowerBlock(MobEffects.HEALTH_BOOST, 10, BlockBehaviour.Properties.copy(Blocks.POPPY), () -> Blocks.SAND), ModCreativeModeTabs.POSTKNIGHT_RESOURCE_TAB);

    public static final RegistryObject<Block> POTTED_CERULEAF = registerBlockWithoutBlockItem("potted_ceruleaf",
            () -> new FlowerPotBlock(null, ModBlocks.CERULEAF, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_PUFFWORT = registerBlockWithoutBlockItem("potted_puffwort",
            () -> new FlowerPotBlock(null, ModBlocks.PUFFWORT, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_SAGE = registerBlockWithoutBlockItem("potted_sage",
            () -> new FlowerPotBlock(null, ModBlocks.SAGE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_LOW_MALLOW = registerBlockWithoutBlockItem("potted_low_mallow",
            () -> new FlowerPotBlock(null, ModBlocks.LOW_MALLOW, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_ROTASEED = registerBlockWithoutBlockItem("potted_rotaseed",
            () -> new FlowerPotBlock(null, ModBlocks.ROTASEED, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_VALLEY_BELLS = registerBlockWithoutBlockItem("potted_valley_bells",
            () -> new FlowerPotBlock(null, ModBlocks.VALLEY_BELLS, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_KUROOT = registerBlockWithoutBlockItem("potted_kuroot",
            () -> new FlowerPotBlock(null, ModBlocks.KUROOT, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_FORESIGHT_FRUIT = registerBlockWithoutBlockItem("potted_foresight_fruit",
            () -> new FlowerPotBlock(null, ModBlocks.FORESIGHT_FRUIT, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_GOLDEN_BASIL = registerBlockWithoutBlockItem("potted_golden_basil",
            () -> new FlowerPotBlock(null, ModBlocks.GOLDEN_BASIL, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_EVERCHERRY = registerBlockWithoutBlockItem("potted_evercherry",
            () -> new FlowerPotBlock(null, ModBlocks.EVERCHERRY, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_INVIGOROOT = registerBlockWithoutBlockItem("potted_invigoroot",
            () -> new FlowerPotBlock(null, ModBlocks.INVIGOROOT, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_NIGHTLIGHT_CAP = registerBlockWithoutBlockItem("potted_nightlight_cap",
            () -> new FlowerPotBlock(null, ModBlocks.NIGHTLIGHT_CAP, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_TINGLETOE = registerBlockWithoutBlockItem("potted_tingletoe",
            () -> new FlowerPotBlock(null, ModBlocks.TINGLETOE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_WINTERMINT = registerBlockWithoutBlockItem("potted_wintermint",
            () -> new FlowerPotBlock(null, ModBlocks.WINTERMINT, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_AFLOE_VERA = registerBlockWithoutBlockItem("potted_afloe_vera",
            () -> new FlowerPotBlock(null, ModBlocks.AFLOE_VERA, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_BRIGHTFERN = registerBlockWithoutBlockItem("potted_brightfern",
            () -> new FlowerPotBlock(null, ModBlocks.BRIGHTFERN, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_HARDTHORN = registerBlockWithoutBlockItem("potted_hardthorn",
            () -> new FlowerPotBlock(null, ModBlocks.HARDTHORN, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_DYNAPOD = registerBlockWithoutBlockItem("potted_dynapod",
            () -> new FlowerPotBlock(null, ModBlocks.DYNAPOD, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_SOURBULB = registerBlockWithoutBlockItem("potted_sourbulb",
            () -> new FlowerPotBlock(null, ModBlocks.SOURBULB, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_AZURE_PEA = registerBlockWithoutBlockItem("potted_azure_pea",
            () -> new FlowerPotBlock(null, ModBlocks.AZURE_PEA, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_RARENANA = registerBlockWithoutBlockItem("potted_rarenana",
            () -> new FlowerPotBlock(null, ModBlocks.RARENANA, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_SEA_DATES = registerBlockWithoutBlockItem("potted_sea_dates",
            () -> new FlowerPotBlock(null, ModBlocks.SEA_DATES, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_OASIS_GRAPES = registerBlockWithoutBlockItem("potted_oasis_grapes",
            () -> new FlowerPotBlock(null, ModBlocks.OASIS_GRAPES, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_CACTOPUS_POD = registerBlockWithoutBlockItem("potted_cactopus_pod",
            () -> new FlowerPotBlock(null, ModBlocks.CACTOPUS_POD, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
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
