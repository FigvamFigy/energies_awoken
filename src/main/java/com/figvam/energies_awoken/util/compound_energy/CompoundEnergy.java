package com.figvam.energies_awoken.util.compound_energy;

import com.figvam.energies_awoken.util.EnumCompoundEnergy;
import com.figvam.energies_awoken.util.ItemCorrespondingCompoundEnergy;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class CompoundEnergy implements ICompoundEnergy {

    private int floraEnergy = 0;
    private int grassEnergy = 0;



    @Override
    public void fillCompoundEnergyFromItem(Item item) {
        EnumCompoundEnergy energy = ItemCorrespondingCompoundEnergy.getCompoundEnergyFromItem(item);

        switch (energy){
            case FLORA: floraEnergy++;
            case GRASS: grassEnergy++;
        }
    }

    @Override
    public void setEnergy(EnumCompoundEnergy energy, int value) {

        switch (energy){
            case FLORA: floraEnergy = value;
            case GRASS: grassEnergy = value;

        }
    }

    @Override
    public int getEnergy(EnumCompoundEnergy energy) {

        switch (energy){
            case FLORA: return floraEnergy;
            case GRASS: return grassEnergy;

        }

        return -1;
    }

    @Override
    public ArrayList<EnumCompoundEnergy> getExistingCompoundLifeEnergy(){
        ArrayList<EnumCompoundEnergy> arrayList = new ArrayList<>();

        if(floraEnergy > 0){
            arrayList.add(EnumCompoundEnergy.FLORA);
        }
        if(grassEnergy > 0){
            arrayList.add(EnumCompoundEnergy.GRASS);
        }

        return arrayList;
    }
}
