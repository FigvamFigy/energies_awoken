package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_three;

import com.figvam.energies_awoken.EnergiesAwokenMain;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.BlockBreakdownMachineLevelTwo;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2.TileEntityBreakdownMachineLevelTwo;
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

public class BlockBreakdownMachineLevelThree extends Block {

    private static BlockBreakdownMachineLevelThree instance = null;

    private BlockBreakdownMachineLevelThree(){
        super(Material.ROCK);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(5f);

        setUnlocalizedName("breakdown_machine_level_three");
        setRegistryName("breakdown_machine_level_three");

    }

    public static BlockBreakdownMachineLevelThree getInstance(){
        if(instance == null){
            instance = new BlockBreakdownMachineLevelThree();
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
        return new TileEntityBreakdownMachineLevelThree();
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if(!worldIn.isRemote){
            TileEntityBreakdownMachineLevelThree tileEntity = TileEntityBreakdownMachineLevelThree.getTileEntity(worldIn,pos);

            playerIn.openGui(EnergiesAwokenMain.instance, GuiIDList.BREAKDOWN_MACHINE_LEVEL_THREE_ID,worldIn,pos.getX(),pos.getY(),pos.getZ());
        }

        return true;
    }
}
