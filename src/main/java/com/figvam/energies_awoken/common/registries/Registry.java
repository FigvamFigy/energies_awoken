package com.figvam.energies_awoken.common.registries;

import com.figvam.energies_awoken.ModDetails;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {


    private static final DeferredRegister<Block> BLOCK_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, ModDetails.MOD_ID);
    private static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS,ModDetails.MOD_ID);


    public static DeferredRegister<Block> getBlockDeferredRegister() {
        return BLOCK_DEFERRED_REGISTER;
    }

    public static DeferredRegister<Item> getItemDeferredRegister() {
        return ITEM_DEFERRED_REGISTER;
    }
}
