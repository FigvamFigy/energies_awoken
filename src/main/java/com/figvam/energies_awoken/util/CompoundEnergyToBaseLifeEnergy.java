package com.figvam.energies_awoken.util;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class will contain a hashmap with a key of EnumCompoundEnergy and a value of an ArrayList<EnumBaseLifeEnergy>
 *
 */

public class CompoundEnergyToBaseLifeEnergy {


    public static HashMap<EnumCompoundEnergy,ArrayList<EnumBaseLifeEnergy>> hashMapCompoundToBase;


    public CompoundEnergyToBaseLifeEnergy(){
        hashMapCompoundToBase = new HashMap<>();
        fillHashMap();

    }


    private static void fillHashMap(){
        ArrayList<EnumBaseLifeEnergy> arrayListFloraToBase = floraToBase();

        hashMapCompoundToBase.put(EnumCompoundEnergy.FLORA,arrayListFloraToBase);

    }


    private static ArrayList<EnumBaseLifeEnergy> floraToBase(){
        ArrayList<EnumBaseLifeEnergy> arrayList = new ArrayList<>();
        arrayList.add(EnumBaseLifeEnergy.GROUNDING);
        arrayList.add(EnumBaseLifeEnergy.TERRA);


        return arrayList;
    }

}
