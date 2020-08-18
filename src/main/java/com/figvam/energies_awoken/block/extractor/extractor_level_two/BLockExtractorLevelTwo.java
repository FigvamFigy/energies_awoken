package com.figvam.energies_awoken.block.extractor.extractor_level_two;

import com.figvam.energies_awoken.EnergiesAwokenMain;
import com.figvam.energies_awoken.block.extractor.extractor_level_one.BlockExtractorLevelOne;
import com.figvam.energies_awoken.block.extractor.extractor_level_one.TileEntityExtractorLevelOne;
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

public class BLockExtractorLevelTwo extends Block {

    private static BLockExtractorLevelTwo instance = null;

    private BLockExtractorLevelTwo(){
        super(Material.IRON);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(5f);

        setUnlocalizedName("extractor_level_two");
        setRegistryName("extractor_level_two");

    }

    public static BLockExtractorLevelTwo getInstance(){
        if(instance == null){
            instance = new BLockExtractorLevelTwo();
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
        return new TileEntityExtractorLevelTwo();
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if(!worldIn.isRemote){

            playerIn.openGui(EnergiesAwokenMain.instance, GuiIDList.EXTRACTOR_LEVEL_TWO,worldIn,pos.getX(),pos.getY(),pos.getZ());
        }

        return true;
    }



}
