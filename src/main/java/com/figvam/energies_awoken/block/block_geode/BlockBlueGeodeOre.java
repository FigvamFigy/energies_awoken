package com.figvam.energies_awoken.block.block_geode;

import com.figvam.energies_awoken.item.item.geode.ItemBlueGeode;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class BlockBlueGeodeOre extends Block {


    private static BlockBlueGeodeOre instance = null;

    private BlockBlueGeodeOre(){
        super(Material.ROCK);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(5f);

        setUnlocalizedName("blue_geode_ore");
        setRegistryName("blue_geode_ore");

    }


    public static BlockBlueGeodeOre getInstance(){
        if(instance == null){
            instance = new BlockBlueGeodeOre();
        }
        return instance;
    }


    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemBlueGeode.getInstance();
    }


    //Without fortune
    @Override
    public int quantityDropped(IBlockState blockState, int fortune, Random random){
        return quantityDroppedWithBonus(fortune,random);
    }

    //With Fortune
    @Override
    public int quantityDroppedWithBonus(int fortuneLevel, Random random){

        if (fortuneLevel > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortuneLevel))
        {
            int i = random.nextInt(fortuneLevel + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }

    }


    //EXP
    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
    {
        return 2;
    }
}
