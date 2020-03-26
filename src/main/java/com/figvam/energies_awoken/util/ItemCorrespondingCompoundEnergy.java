package com.figvam.energies_awoken.util;

import net.minecraft.item.Item;

import java.util.HashMap;


/**
 * This class is used for to determine what the compound life energy corresponds to a selected item
 * We call this in each of the item classes to add which items will be in the list
 */

public class ItemCorrespondingCompoundEnergy {


    private static HashMap<Item,CompoundEnergyBase> hashMapItemToCompoundEnergy;


    public ItemCorrespondingCompoundEnergy(){
        hashMapItemToCompoundEnergy = new HashMap<>();
    }

    public static void addItemToHashMap(Item item, CompoundEnergyBase compoundEnergy){
        hashMapItemToCompoundEnergy.put(item,compoundEnergy);
    }


    public static CompoundEnergyBase getItemCompoundEnergy(Item item){
        return hashMapItemToCompoundEnergy.get(item);
    }



}
