package com.figvam.energies_awoken.common.item.backpack;


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;


import javax.annotation.Nullable;

public class ItemLifeEnergyBackpack extends ArmorItem {



    public ItemLifeEnergyBackpack(IArmorMaterial armorMaterial,Properties properties){
        super(armorMaterial,EquipmentSlotType.CHEST,properties.group(ItemGroup.COMBAT));

    }


    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "energies_awoken:textures/model/backpack_model.png";
    }

    @Nullable
    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return (A) new ModelBackpack<>();
    }


}
