package com.figvam.energies_awoken.registries;

import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.block.breakdown_machine.TileEntityBreakdownMachine;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import org.lwjgl.Sys;

@Mod.EventBusSubscriber
public class RegistryEventHandler {



    //BLOCK REGISTER  Registers the block to the game
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.registerAll(BlockModList.BLOCKS);


    }


    //ITEM REGISTER Registers the item into the game
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
        //To make the lines shorter
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.registerAll(ItemModList.ITEMS);


    }

    //TILE ENTITY REGISTER Registers tile entities into the game
    public static void registerTileEntity(){

        for(int index = 0; index < TileEntityModList.TILE_ENTITIES.size(); index++){
            String resourceLocationString = ModDetailReference.MOD_ID + ":tile_entity_" + TileEntityModList.BLOCKS.get(index).getUnlocalizedName();
            ResourceLocation key = new ResourceLocation(resourceLocationString);

            GameRegistry.registerTileEntity(TileEntityModList.TILE_ENTITIES.get(index),key);

        }


    }







    //Registers the models into the game
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){

        for(Block block: BlockModList.BLOCKS){
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),0,
                    new ModelResourceLocation(Item.getItemFromBlock(block).getRegistryName(),"inventory"));

        }

        for(Item item: ItemModList.ITEMS){
            ModelLoader.setCustomModelResourceLocation(item,0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
        }


    }




}
