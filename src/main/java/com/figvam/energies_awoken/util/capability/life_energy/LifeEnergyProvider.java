package com.figvam.energies_awoken.util.capability.life_energy;

import com.figvam.energies_awoken.ModDetails;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class LifeEnergyProvider implements ICapabilitySerializable<INBT> {

    @CapabilityInject(ILifeEnergyCapability.class)
    public static final Capability<ILifeEnergyCapability> LIFE_ENERGY_CAP = null;

    private LazyOptional<ILifeEnergyCapability> instance = LazyOptional.of(LIFE_ENERGY_CAP::getDefaultInstance);

    public static final ResourceLocation RESOURCE_LOCATION_LIFE_ENERGY_CAP = new ResourceLocation(ModDetails.MOD_ID, "life_energy_capability");

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return LIFE_ENERGY_CAP.orEmpty(cap,instance);
    }

    @Override
    public INBT serializeNBT() {
        return LIFE_ENERGY_CAP.getStorage().writeNBT(LIFE_ENERGY_CAP, instance.orElseThrow(() -> new IllegalArgumentException("at serialize")), null);

    }

    @Override
    public void deserializeNBT(INBT nbt) {
        LIFE_ENERGY_CAP.getStorage().readNBT(LIFE_ENERGY_CAP, instance.orElseThrow(() -> new IllegalArgumentException("at deserialize")), null, nbt);

    }
}
