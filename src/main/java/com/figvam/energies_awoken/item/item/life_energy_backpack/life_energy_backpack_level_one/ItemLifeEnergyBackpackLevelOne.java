package com.figvam.energies_awoken.item.item.life_energy_backpack.life_energy_backpack_level_one;

import com.figvam.energies_awoken.EnergiesAwokenMain;
import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.util.ArmorMaterialUtil;
import com.figvam.energies_awoken.util.EnumCompoundEnergy;
import com.figvam.energies_awoken.util.GuiIDList;
import com.figvam.energies_awoken.util.compound_energy.CompoundEnergyProvider;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.*;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.items.CapabilityItemHandler;
import org.lwjgl.Sys;

import javax.annotation.Nullable;

public class ItemLifeEnergyBackpackLevelOne extends ItemArmor {


    public LifeEnergyProvider lifeEnergyProvider;

    private static ItemLifeEnergyBackpackLevelOne instance = null;

    private ItemLifeEnergyBackpackLevelOne() {
        super(ArmorMaterialUtil.getInstance().LIFE_ENERGY_BACKPACK, 0, EntityEquipmentSlot.CHEST);

        setCreativeTab(CreativeTabs.MATERIALS);

        setUnlocalizedName("life_energy_backpack_level_one");
        setRegistryName("life_energy_backpack_level_one");

        lifeEnergyProvider = new LifeEnergyProvider();
    }

    public static ItemLifeEnergyBackpackLevelOne getInstance() {
        if (instance == null) {
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

    @Nullable
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt) {
        // return new LifeEnergyProvider();
        return null;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        //ILifeEnergy lifeEnergy = itemstack.getCapability(LifeEnergyProvider.LIFE_ENERGY_CAPABILITY, null);
        ILifeEnergy lifeEnergy = lifeEnergyProvider.getCapability(LifeEnergyProvider.LIFE_ENERGY_CAPABILITY, null);

        if (!worldIn.isRemote) {
            if (playerIn.isSneaking()) {



//                if (lifeEnergy.getEnergyValue(EnumLifeEnergy.beast) != 20) {
//                    lifeEnergy.addValueToEnergy(EnumLifeEnergy.beast, 10);
//
//                }

                //lifeEnergy.addValueToEnergy(EnumLifeEnergy.beast, 10);
                ITextComponent iTextComponent = new TextComponentString("" + lifeEnergy.getEnergyValue(EnumLifeEnergy.beast));

                playerIn.sendMessage(iTextComponent);
                //System.out.println(lifeEnergy.getEnergyValue(EnumLifeEnergy.beast));
            }
        }

        if (playerIn.isSneaking()) {

            playerIn.openGui(EnergiesAwokenMain.instance, GuiIDList.BACKPACK, worldIn, 0, 0, 0);
            return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
        } else {
            //return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
            return super.onItemRightClick(worldIn, playerIn, handIn);
        }


    }


}
