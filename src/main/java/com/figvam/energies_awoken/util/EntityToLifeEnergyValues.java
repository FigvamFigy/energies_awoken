package com.figvam.energies_awoken.util;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.monster.EntityZombie;

import java.util.HashMap;

public class EntityToLifeEnergyValues {

    //entity id, lifeEnergyValues
    private HashMap<Integer, LifeEnergyValues> hashMapLifeEnergyValues;

    public EntityToLifeEnergyValues() {
        this.hashMapLifeEnergyValues = new HashMap<>();
        fillHashMap();
    }


    private void fillHashMap(){
        LifeEnergyValues lifeEnergyValues = new LifeEnergyValues(0,0,0,1,0,0,0,0,0,0,0,0);//Zombie
        hashMapLifeEnergyValues.put(EntityList.getID(EntityZombie.class),lifeEnergyValues);



    }

    public LifeEnergyValues getLifeEnergyValuesFromEntityID(int entityID){
        return hashMapLifeEnergyValues.get(entityID);
    }





}
