package com.figvam.energies_awoken.util.compound_energy;

import net.minecraft.item.Item;

public interface ICompoundEnergy {


    void fillCompoundEnergyFromItem(Item item);

    void setFloraEnergy(int value);
    int getFloraEnergy();


}
