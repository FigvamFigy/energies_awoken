package com.figvam.energies_awoken.item.item.life_energy_backpack.life_energy_backpack_level_one;

import com.figvam.energies_awoken.EnergiesAwokenMain;
import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.util.ArmorMaterialUtil;
import com.figvam.energies_awoken.util.GuiIDList;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

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

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);


        if(playerIn.isSneaking()){
            playerIn.openGui(EnergiesAwokenMain.instance, GuiIDList.BACKPACK, worldIn, 0, 0, 0);
            return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
        }
        else {
            return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
        }
        //TODO apply the right clicking to equip the backpack, like other armor pieces

//        if(!playerIn.isSneaking()){
//            super.onItemRightClick(worldIn,playerIn,handIn);
//        }
//        else {
//            playerIn.openGui(EnergiesAwokenMain.instance, GuiIDList.BACKPACK,worldIn,0,0,0);
//            return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
//        }
//        return null;
    }
}
