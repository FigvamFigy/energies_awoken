package com.figvam.energies_awoken.block.breakdown_machine;

import com.figvam.energies_awoken.EnergiesAwokenMain;
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
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockBreakdownMachine extends Block {

    private static BlockBreakdownMachine instance;

    private BlockBreakdownMachine(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        setUnlocalizedName("breakdown_machine");
        setRegistryName("breakdown_machine");

    }


    public static BlockBreakdownMachine getInstance(){
        if(instance == null){
            instance = new BlockBreakdownMachine();
        }
        return instance;
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote){
            TileEntityBreakdownMachine tile = TileEntityBreakdownMachine.getTileEntity(worldIn,pos);
            tile.incrementCount();
            playerIn.sendMessage(new TextComponentString("Count: " + tile.count));

            playerIn.openGui(EnergiesAwokenMain.instance, GuiIDList.BREAKDOWN_MACHINE_ID,worldIn,pos.getX(),pos.getY(),pos.getZ());


        }


        return true;
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityBreakdownMachine();
    }
}
