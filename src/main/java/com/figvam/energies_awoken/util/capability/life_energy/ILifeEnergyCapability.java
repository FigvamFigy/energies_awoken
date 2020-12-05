package com.figvam.energies_awoken.util.capability.life_energy;

import com.figvam.energies_awoken.util.EnumLifeEnergy;

public interface ILifeEnergyCapability {

    void addEnergy(EnumLifeEnergy enumLifeEnergy, int amount);
    void removeEnergy(EnumLifeEnergy enumLifeEnergy, int amount);
    void setEnergy(EnumLifeEnergy enumLifeEnergy, int amount);
    int getEnergy(EnumLifeEnergy enumLifeEnergy);
}
