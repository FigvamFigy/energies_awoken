package com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one;

import com.figvam.energies_awoken.EnergiesAwokenMain;
import com.figvam.energies_awoken.block.breakdown_machine.BlockBreakdownMachine;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_three.TileEntityBreakdownMachineLevelThree;
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

public class BlockEssenceRecombinatorLevelOne extends Block {

    private static BlockEssenceRecombinatorLevelOne instance;

    private BlockEssenceRecombinatorLevelOne(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(1f);

        setUnlocalizedName("essence_recombinator_level_one");
        setRegistryName("essence_recombinator_level_one");

    }


    public static BlockEssenceRecombinatorLevelOne getInstance(){
        if(instance == null){
            instance = new BlockEssenceRecombinatorLevelOne();
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
        return new TileEntityEssenceRecombinatorLevelOne();
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if(!worldIn.isRemote){
            TileEntityEssenceRecombinatorLevelOne tileEntity = TileEntityEssenceRecombinatorLevelOne.getTileEntity(worldIn,pos);

            playerIn.openGui(EnergiesAwokenMain.instance, GuiIDList.ESSENCE_RECOMBINATOR_LEVEL_ONE,worldIn,pos.getX(),pos.getY(),pos.getZ());
        }

        return true;
    }

}
