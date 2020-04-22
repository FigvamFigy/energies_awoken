package com.figvam.energies_awoken.util.compound_energy;

import com.figvam.energies_awoken.util.EnumCompoundEnergy;
import net.minecraft.item.Item;

import java.util.ArrayList;

public interface ICompoundEnergy {


    void fillCompoundEnergyFromItem(Item item);

    void setEnergy(EnumCompoundEnergy energy, int value);
    int getEnergy(EnumCompoundEnergy energy);

    public ArrayList<EnumCompoundEnergy> getExistingCompoundLifeEnergy();
}
