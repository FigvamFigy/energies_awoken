package com.figvam.energies_awoken.util.compound_energy;

import com.figvam.energies_awoken.util.EnumCompoundEnergy;
import com.figvam.energies_awoken.util.ItemCorrespondingCompoundEnergy;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class CompoundEnergy implements ICompoundEnergy {

    private int floraEnergy = 0;



    @Override
    public void fillCompoundEnergyFromItem(Item item) {
        EnumCompoundEnergy energy = ItemCorrespondingCompoundEnergy.getCompoundEnergyFromItem(item);

        switch (energy){
            case FLORA: floraEnergy++;
        }
    }

    @Override
    public void setEnergy(EnumCompoundEnergy energy, int value) {

        switch (energy){
            case FLORA: floraEnergy = value;

        }
    }

    @Override
    public int getEnergy(EnumCompoundEnergy energy) {

        switch (energy){
            case FLORA: return floraEnergy;

        }

        return -1;
    }

    @Override
    public ArrayList<EnumCompoundEnergy> getExistingCompoundLifeEnergy(){
        ArrayList<EnumCompoundEnergy> arrayList = new ArrayList<>();

        if(floraEnergy > 0){
            arrayList.add(EnumCompoundEnergy.FLORA);
        }

        return arrayList;
    }
}
