package com.figvam.energies_awoken.util.capability.life_energy;

import com.figvam.energies_awoken.util.EnumLifeEnergy;
import java.util.HashMap;

public class LifeEnergyCapability implements ILifeEnergyCapability {

    private HashMap<EnumLifeEnergy,Integer> hashMapLifeEnergy;

    public LifeEnergyCapability() {
        this.hashMapLifeEnergy = new HashMap<>();

        for(EnumLifeEnergy enumLifeEnergy: EnumLifeEnergy.values()){
            hashMapLifeEnergy.put(enumLifeEnergy,0);
        }

    }

    @Override
    public void addEnergy(EnumLifeEnergy enumLifeEnergy, int amount) {
        int newValue = hashMapLifeEnergy.get(enumLifeEnergy) + amount;
        hashMapLifeEnergy.replace(enumLifeEnergy,newValue);
    }

    @Override
    public void removeEnergy(EnumLifeEnergy enumLifeEnergy, int amount) {
        int newValue = hashMapLifeEnergy.get(enumLifeEnergy) - amount;
        hashMapLifeEnergy.replace(enumLifeEnergy,newValue);
    }

    @Override
    public void setEnergy(EnumLifeEnergy enumLifeEnergy, int amount) {
        hashMapLifeEnergy.replace(enumLifeEnergy,amount);
    }

    @Override
    public int getEnergy(EnumLifeEnergy enumLifeEnergy) {
        return hashMapLifeEnergy.get(enumLifeEnergy);
    }
}
