package com.figvam.energies_awoken.util.custom_capabilities.life_energy;


import com.figvam.energies_awoken.util.compound_energy.ICompoundEnergy;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

//This is what we use to talk to the capability. the "front end" if you will
public class LifeEnergyProvider implements ICapabilitySerializable<NBTTagCompound> {


    @CapabilityInject(ILifeEnergy.class)
    public static final Capability<ILifeEnergy> LIFE_ENERGY_CAPABILITY = null;

    private ILifeEnergy instance = LIFE_ENERGY_CAPABILITY.getDefaultInstance();


    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {

        return capability == LIFE_ENERGY_CAPABILITY;
    }

    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        return capability == LIFE_ENERGY_CAPABILITY ? LIFE_ENERGY_CAPABILITY.<T> cast(this.instance) : null;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        return (NBTTagCompound) LIFE_ENERGY_CAPABILITY.getStorage().writeNBT(LIFE_ENERGY_CAPABILITY,this.instance,null);
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        LIFE_ENERGY_CAPABILITY.getStorage().readNBT(LIFE_ENERGY_CAPABILITY,this.instance,null,nbt);
    }
}
