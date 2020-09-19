package com.figvam.energies_awoken.util.custom_capabilities.life_energy;

import java.util.HashMap;

public class LifeEnergy implements ILifeEnergy{

    private HashMap<EnumLifeEnergy,Integer> hashMapLifeEnergy;


    public LifeEnergy() {
        hashMapLifeEnergy = new HashMap<>();
        setupHashMap();

    }

    private void setupHashMap(){

        for(EnumLifeEnergy energy:EnumLifeEnergy.values()){
            hashMapLifeEnergy.put(energy,0);
        }

    }

    @Override
    public void addValueToEnergy(EnumLifeEnergy energy, int value) {
        int oldEnergy = hashMapLifeEnergy.get(energy);
        int newEnergy = oldEnergy + value;

        hashMapLifeEnergy.replace(energy,newEnergy);
    }

    @Override
    public void removeValueFromEnergy(EnumLifeEnergy energy, int value) {
        int oldEnergy = hashMapLifeEnergy.get(energy);
        int newEnergy = oldEnergy - value;

        hashMapLifeEnergy.replace(energy,newEnergy);
    }

    @Override
    public int getEnergyValue(EnumLifeEnergy energy) {
        return hashMapLifeEnergy.get(energy);
    }


    @Override
    public void setValueToEnergy(EnumLifeEnergy energy, int value) {
        hashMapLifeEnergy.replace(energy,value);
    }
}
