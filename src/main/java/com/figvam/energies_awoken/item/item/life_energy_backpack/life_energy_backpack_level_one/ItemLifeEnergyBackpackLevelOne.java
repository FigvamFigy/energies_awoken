package com.figvam.energies_awoken.item.item.life_energy_backpack.life_energy_backpack_level_one;

import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.util.ArmorMaterialUtil;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class ItemLifeEnergyBackpackLevelOne extends ItemArmor {


    private static ItemLifeEnergyBackpackLevelOne instance = null;

    private ItemLifeEnergyBackpackLevelOne(){
        super(ArmorMaterialUtil.getInstance().LIFE_ENERGY_BACKPACK,0, EntityEquipmentSlot.CHEST);

        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("life_energy_backpack_level_one");
        setRegistryName("life_energy_backpack_level_one");
    }

    public static ItemLifeEnergyBackpackLevelOne getInstance(){
        if(instance == null){
            instance = new ItemLifeEnergyBackpackLevelOne();
        }

        return instance;
    }

    @Nullable
    @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        return new ModelLifeEnergyBackpackLevelOne();
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return ModDetailReference.MOD_ID + ":textures/entity/backpack/backpack_level_one.png";
    }


}
