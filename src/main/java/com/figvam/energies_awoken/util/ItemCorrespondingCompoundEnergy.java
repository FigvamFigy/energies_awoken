package com.figvam.energies_awoken.util;

import net.minecraft.item.Item;

import java.util.HashMap;


/**
 * This class is used for to determine what the compound life energy corresponds to a selected item
 * We call this in each of the item classes to add which items will be in the list
 */

public class ItemCorrespondingCompoundEnergy {


    private static HashMap<Item,EnumCompoundEnergy> hashMapItemToCompoundEnergy;


    public ItemCorrespondingCompoundEnergy(){
        hashMapItemToCompoundEnergy = new HashMap<>();
    }

    public static void addItemToHashMap(Item item, EnumCompoundEnergy compoundEnergy){
        hashMapItemToCompoundEnergy.put(item,compoundEnergy);
    }


    public static EnumCompoundEnergy getCompoundEnergyFromItem(Item item){
        return hashMapItemToCompoundEnergy.get(item);
    }


    public static void fillHashMapFromAcceptedItems(Item[] acceptedItemsArray, EnumCompoundEnergy[] compoundEnergyArray){
        if(acceptedItemsArray.length != compoundEnergyArray.length){
            throw new IllegalArgumentException("Item[] length is not the same size as CompoundEnergyBase[] in fillHashMapFromAcceptedItems in ItemCorrespondingCompoundEnergy");
        }

        for(int index = 0; index < acceptedItemsArray.length; index++){
            hashMapItemToCompoundEnergy.put(acceptedItemsArray[index],compoundEnergyArray[index]);
        }
    }


    public static boolean isItemInHashMap(Item item){
        return hashMapItemToCompoundEnergy.containsKey(item);
    }






}
