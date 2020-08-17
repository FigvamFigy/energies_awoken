package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1;

import com.figvam.energies_awoken.EnergiesAwokenMain;
import com.figvam.energies_awoken.block.breakdown_machine.TileEntityBreakdownMachine;
import com.figvam.energies_awoken.util.GuiIDList;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockBreakdownMachineLevelOne extends Block {

    private static BlockBreakdownMachineLevelOne instance = null;

    private BlockBreakdownMachineLevelOne(){
        super(Material.ROCK);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(5f);

        setUnlocalizedName("breakdown_machine_level_one");
        setRegistryName("breakdown_machine_level_one");

    }

    public static BlockBreakdownMachineLevelOne getInstance(){
        if(instance == null){
            instance = new BlockBreakdownMachineLevelOne();
        }
        return instance;
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }


    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityBreakdownMachineLevelOne();
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if(!worldIn.isRemote){
            TileEntityBreakdownMachineLevelOne tileEntity = TileEntityBreakdownMachineLevelOne.getTileEntity(worldIn,pos);

            playerIn.openGui(EnergiesAwokenMain.instance, GuiIDList.BREAKDOWN_MACHINE_LEVEL_ONE_ID,worldIn,pos.getX(),pos.getY(),pos.getZ());
        }

        return true;
    }
}
