package com.figvam.energies_awoken.util.capability.life_energy;

import com.figvam.energies_awoken.util.EnumLifeEnergy;
import net.minecraft.command.arguments.NBTCompoundTagArgument;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.IntNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LifeEnergyCapbilityStorage implements Capability.IStorage<ILifeEnergyCapability>{


    @Nullable
    @Override
    public INBT writeNBT(Capability<ILifeEnergyCapability> capability, ILifeEnergyCapability instance, Direction side) {


        ListNBT outgoingNBT = new ListNBT();

        for(EnumLifeEnergy enumLifeEnergy: EnumLifeEnergy.values()){
            int energyValue = instance.getEnergy(enumLifeEnergy);
            IntNBT energyValueNBT = IntNBT.valueOf(energyValue);

            CompoundNBT compoundNBT = new CompoundNBT();
            compoundNBT.put(enumLifeEnergy.toString(),energyValueNBT);

            outgoingNBT.add(compoundNBT);

        }

        return outgoingNBT;


    }

    @Override
    public void readNBT(Capability<ILifeEnergyCapability> capability, ILifeEnergyCapability instance, Direction side, INBT nbt) {

        ListNBT incomingNBT = (ListNBT) nbt;

        int counter = 0;
        for(EnumLifeEnergy enumLifeEnergy: EnumLifeEnergy.values()){
            CompoundNBT compoundNBT = incomingNBT.getCompound(counter);
            int energyValue = compoundNBT.getInt(enumLifeEnergy.toString());

            instance.setEnergy(enumLifeEnergy,energyValue);
            counter++;
        }

    }
}
