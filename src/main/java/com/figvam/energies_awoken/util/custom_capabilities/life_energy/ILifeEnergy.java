package com.figvam.energies_awoken.util.custom_capabilities.life_energy;

public interface ILifeEnergy {

    void setValueToEnergy(EnumLifeEnergy energy, int value);

    void addValueToEnergy(EnumLifeEnergy energy, int value);
    void removeValueFromEnergy(EnumLifeEnergy energy, int value);

    int getEnergyValue(EnumLifeEnergy energy);




}
