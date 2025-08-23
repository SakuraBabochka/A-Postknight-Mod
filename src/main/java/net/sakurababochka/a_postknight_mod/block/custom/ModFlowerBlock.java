package net.sakurababochka.a_postknight_mod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.PlantType;

import java.util.function.Supplier;

public class ModFlowerBlock extends FlowerBlock {
    private Supplier<Block> otherDirt;

    public ModFlowerBlock(MobEffect pSuspiciousStewEffect, int pEffectDuration, Properties pProperties, Supplier<Block> otherDirt) {
        super(pSuspiciousStewEffect, pEffectDuration, pProperties);
        this.otherDirt = otherDirt;
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(otherDirt.get());
    }

    @Override
    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
        return PlantType.get("custom");
    }
}
