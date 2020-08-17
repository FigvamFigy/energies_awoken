package com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_two;

import com.figvam.energies_awoken.EnergiesAwokenMain;
import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.BlockEssenceRecombinatorLevelOne;
import com.figvam.energies_awoken.block.essence_recombinator.essence_recombinator_level_one.TileEntityEssenceRecombinatorLevelOne;
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

public class BlockEssenceRecombinatorLevelTwo extends Block {

    private static BlockEssenceRecombinatorLevelTwo instance;

    private BlockEssenceRecombinatorLevelTwo(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(1f);

        setUnlocalizedName("essence_recombinator_level_two");
        setRegistryName("essence_recombinator_level_two");

    }


    public static BlockEssenceRecombinatorLevelTwo getInstance(){
        if(instance == null){
            instance = new BlockEssenceRecombinatorLevelTwo();
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
        return new TileEntityEssenceRecombinatorLevelTwo();
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if(!worldIn.isRemote){

            playerIn.openGui(EnergiesAwokenMain.instance, GuiIDList.ESSENCE_RECOMBINATOR_LEVEL_TWO,worldIn,pos.getX(),pos.getY(),pos.getZ());
        }

        return true;
    }
}
