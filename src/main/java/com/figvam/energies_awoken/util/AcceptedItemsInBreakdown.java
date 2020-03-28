package com.figvam.energies_awoken.util;


import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class AcceptedItemsInBreakdown {


    public static Item[] ACCEPTED_ITEMS = {
        Item.REGISTRY.getObject(new ResourceLocation("minecraft:yellow_flower"))

    };


    public static EnumCompoundEnergy[] ITEM_COMPOUND_ENERGY = {
        EnumCompoundEnergy.FLORA

    };



}
