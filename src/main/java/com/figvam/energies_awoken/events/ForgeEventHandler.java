package com.figvam.energies_awoken.events;

import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.item.item.life_energy_backpack.life_energy_backpack_level_one.ItemLifeEnergyBackpackLevelOne;
import com.figvam.energies_awoken.proxy.CommonProxy;
import com.figvam.energies_awoken.util.EntityToLifeEnergyValues;
import com.figvam.energies_awoken.util.LifeEnergyValues;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.EnumLifeEnergy;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.ILifeEnergy;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.LifeEnergyProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.Sys;

@Mod.EventBusSubscriber()
public class ForgeEventHandler {


    //@SideOnly(Side.SERVER)
    @SubscribeEvent
    public void pickupItem(LivingAttackEvent event){


        EntityToLifeEnergyValues lifeEnergyValuesList = new EntityToLifeEnergyValues();

        if(event.getSource().getTrueSource() instanceof EntityPlayer){


            EntityPlayer player = (EntityPlayer)event.getSource().getTrueSource();
            Entity targetHit = event.getEntity();



            if(player.inventory.armorItemInSlot(2).getItem() instanceof ItemLifeEnergyBackpackLevelOne){
                System.out.println("Backpack on!");

                ItemLifeEnergyBackpackLevelOne backpack = (ItemLifeEnergyBackpackLevelOne)player.inventory.armorItemInSlot(2).getItem();

                LifeEnergyValues lifeEnergyValues = lifeEnergyValuesList.getLifeEnergyValuesFromEntityID(EntityList.getID(targetHit.getClass()));

                if(lifeEnergyValues != null){
                    ILifeEnergy lifeEnergy = backpack.getInstance().lifeEnergyProvider.getCapability(LifeEnergyProvider.LIFE_ENERGY_CAPABILITY,null);
                    lifeEnergy.addValueToEnergy(EnumLifeEnergy.beast,lifeEnergyValues.beast);
                    lifeEnergy.addValueToEnergy(EnumLifeEnergy.decaying,lifeEnergyValues.decaying);
                    lifeEnergy.addValueToEnergy(EnumLifeEnergy.demonic,lifeEnergyValues.demonic);

                    System.out.println("lifeEnergy.getEnergyValue(EnumLifeEnergy.beast) = " + lifeEnergy.getEnergyValue(EnumLifeEnergy.beast));
                }
            }
            else {
                System.out.println("Backpack is off!");
            }
        }

    }


    @SubscribeEvent
    public void entityHurt(LivingDamageEvent event){

    }



    //Checks the players current hand and sees if the item it used to attack is a valid item in order for
    private boolean isItemValidToHarvestEnergy(EntityPlayer player){
        return true;
    }


}
