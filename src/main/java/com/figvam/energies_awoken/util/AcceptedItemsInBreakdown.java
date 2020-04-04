package com.figvam.energies_awoken.util;


import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;


/**
 * This class is used to put vanilla minecraft items into a list
 *
 *
 */

public class AcceptedItemsInBreakdown {


    public static Item[] ACCEPTED_ITEMS = {
        Item.REGISTRY.getObject(new ResourceLocation("minecraft:yellow_flower")),
        Item.REGISTRY.getObject(new ResourceLocation("minecraft:tallgrass"))

    };


    public static EnumCompoundEnergy[] ITEM_COMPOUND_ENERGY = {
        EnumCompoundEnergy.FLORA,
        EnumCompoundEnergy.GRASS

    };



}
