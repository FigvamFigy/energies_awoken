package com.figvam.energies_awoken.util;

import com.figvam.energies_awoken.ModDetailReference;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterialUtil {


    public static final ItemArmor.ArmorMaterial LIFE_ENERGY_BACKPACK = EnumHelper.addArmorMaterial(
            "life_energy_backpack",
            ModDetailReference.MOD_ID + ":life_energy_backpack",
            5,
            new int[]{1, 2, 0, 1},
            0,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F);

    private static ArmorMaterialUtil instance = null;

    private ArmorMaterialUtil(){

    }


    public static ArmorMaterialUtil getInstance(){
        if(instance == null){
            instance = new ArmorMaterialUtil();
        }
        return instance;
    }



}
