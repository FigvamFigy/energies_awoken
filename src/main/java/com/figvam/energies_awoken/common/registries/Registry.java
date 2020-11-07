package com.figvam.energies_awoken.common.registries;

import com.figvam.energies_awoken.ModDetails;
import com.figvam.energies_awoken.common.item.vial.ItemAquaVial;
import com.figvam.energies_awoken.common.item.vial.ItemInfernalVial;
import com.figvam.energies_awoken.common.item.vial.ItemTerraVial;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {


    private static final DeferredRegister<Block> BLOCK_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, ModDetails.MOD_ID);
    private static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS,ModDetails.MOD_ID);


    //BLOCKS


    //ITEMS
    private static final RegistryObject<Item> ITEM_INFERNAL_VIAL = ITEM_DEFERRED_REGISTER.register("infernal_vial", () -> new ItemInfernalVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_TERRA_VIAL = ITEM_DEFERRED_REGISTER.register("terra_vial", () -> new ItemTerraVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_AQUA_VIAL = ITEM_DEFERRED_REGISTER.register("aqua_vial", () -> new ItemAquaVial(new Item.Properties()));

    public static DeferredRegister<Block> getBlockDeferredRegister() {
        return BLOCK_DEFERRED_REGISTER;
    }

    public static DeferredRegister<Item> getItemDeferredRegister() {
        return ITEM_DEFERRED_REGISTER;
    }
}
