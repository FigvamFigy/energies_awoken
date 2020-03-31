package com.figvam.energies_awoken.util.compound_energy;

import com.figvam.energies_awoken.util.EnumCompoundEnergy;
import com.figvam.energies_awoken.util.ItemCorrespondingCompoundEnergy;
import net.minecraft.item.Item;

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
    public void setFloraEnergy(int value) {
        floraEnergy = value;
    }

    @Override
    public int getFloraEnergy() {
        return floraEnergy;
    }
}
