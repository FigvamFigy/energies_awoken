package com.figvam.energies_awoken.block.splitter.splitter_level_two;

import com.figvam.energies_awoken.EnergiesAwokenMain;
import com.figvam.energies_awoken.block.splitter.splitter_level_one.BlockSplitterLevelOne;
import com.figvam.energies_awoken.block.splitter.splitter_level_one.TileEntitySplitterLevelOne;
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

public class BlockSplitterLevelTwo extends Block {

    private static BlockSplitterLevelTwo instance = null;

    private BlockSplitterLevelTwo(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(2f);

        setUnlocalizedName("splitter_level_two");
        setRegistryName("splitter_level_two");
    }


    public static BlockSplitterLevelTwo getInstance(){
        if(instance == null){
            instance = new BlockSplitterLevelTwo();
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
        return new TileEntitySplitterLevelTwo();
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if(!worldIn.isRemote){

            playerIn.openGui(EnergiesAwokenMain.instance, GuiIDList.SPLITTER_LEVEL_TWO,worldIn,pos.getX(),pos.getY(),pos.getZ());
        }

        return true;
    }

}
