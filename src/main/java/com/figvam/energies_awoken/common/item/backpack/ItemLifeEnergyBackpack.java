package com.figvam.energies_awoken.common.item.backpack;



import com.figvam.energies_awoken.util.EnumLifeEnergy;
import com.figvam.energies_awoken.util.capability.life_energy.ILifeEnergyCapability;
import com.figvam.energies_awoken.util.capability.life_energy.LifeEnergyProvider;
import com.google.common.base.Optional;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fml.network.NetworkHooks;


import javax.annotation.Nullable;

public class ItemLifeEnergyBackpack extends ArmorItem {


    public ItemLifeEnergyBackpack(IArmorMaterial armorMaterial, Properties properties) {
        super(armorMaterial, EquipmentSlotType.CHEST, properties.group(ItemGroup.COMBAT));
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


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (!worldIn.isRemote) {
            NetworkHooks.openGui((ServerPlayerEntity) playerIn, new INamedContainerProvider() {
                @Override
                public ITextComponent getDisplayName() {
                    return new StringTextComponent("TEST");
                }

                @Nullable
                @Override
                public Container createMenu(int id, PlayerInventory playerInventory, PlayerEntity entity) {
                    return new ContainerBackpack(id,playerInventory,null);
                }
            });

        }
        return new ActionResult<>(ActionResultType.SUCCESS,playerIn.getHeldItem(handIn));

    }


}



