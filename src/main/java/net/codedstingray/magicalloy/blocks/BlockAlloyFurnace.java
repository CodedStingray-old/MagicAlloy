package net.codedstingray.magicalloy.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockAlloyFurnace extends Block {

    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    public static final PropertyBool BURNING = PropertyBool.create("burning");

    public BlockAlloyFurnace() {
        super(Material.ROCK);

        setDefaultState(this.blockState.getBaseState().withProperty(BURNING, false).withProperty(FACING, EnumFacing.NORTH));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, BURNING, FACING);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return meta >= 4
                ? getDefaultState().withProperty(BURNING, true).withProperty(FACING, EnumFacing.getHorizontal(meta - 4))
                : getDefaultState().withProperty(BURNING, false).withProperty(FACING, EnumFacing.getHorizontal(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getHorizontalIndex() + (state.getValue(BURNING) ? 4 : 0);
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(BURNING, false).withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }
}
