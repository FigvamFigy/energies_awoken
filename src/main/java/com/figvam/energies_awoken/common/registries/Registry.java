package com.figvam.energies_awoken.common.registries;

import com.figvam.energies_awoken.ModDetails;
import com.figvam.energies_awoken.util.CustomArmorMaterial;
import com.figvam.energies_awoken.common.item.backpack.ItemLifeEnergyBackpack;
import com.figvam.energies_awoken.common.item.vial.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {


    private static final DeferredRegister<Block> BLOCK_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, ModDetails.MOD_ID);
    private static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS,ModDetails.MOD_ID);


    //BLOCKS


    //ITEMS
    private static final RegistryObject<Item> ITEM_INFERNAL_VIAL = ITEM_DEFERRED_REGISTER.register("infernal_vial", () -> new ItemInfernalVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_TERRA_VIAL = ITEM_DEFERRED_REGISTER.register("terra_vial", () -> new ItemTerraVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_AQUA_VIAL = ITEM_DEFERRED_REGISTER.register("aqua_vial", () -> new ItemAquaVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_BEAST_VIAL = ITEM_DEFERRED_REGISTER.register("beast_vial", () -> new ItemBeastVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_DECAYING_VIAL = ITEM_DEFERRED_REGISTER.register("decaying_vial", () -> new ItemDecayingVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_DEMONIC_VIAL = ITEM_DEFERRED_REGISTER.register("demonic_vial", () -> new ItemDemonicVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_DISCORDIAN_VIAL = ITEM_DEFERRED_REGISTER.register("discordian_vial", () -> new ItemDiscordianVIal(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_VOID_VIAL = ITEM_DEFERRED_REGISTER.register("void_vial", () -> new ItemVoidVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_DESOLATION_VIAL = ITEM_DEFERRED_REGISTER.register("desolation_vial", () -> new ItemDesolationVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_ELDRITCH_VIAL = ITEM_DEFERRED_REGISTER.register("eldritch_vial", () -> new ItemEldritchVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_COSMIC_FABRIC_VIAL = ITEM_DEFERRED_REGISTER.register("cosmic_fabric_vial", () -> new ItemCosmicFabricVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_PRESCIENT_VIAL = ITEM_DEFERRED_REGISTER.register("prescient_vial", () -> new ItemPrescientVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_EMPTY_VIAL = ITEM_DEFERRED_REGISTER.register("empty_vial", () -> new ItemEmptyVial(new Item.Properties()));
    private static final RegistryObject<Item> ITEM_LIFE_ENERGY_BACKPACK_VIAL = ITEM_DEFERRED_REGISTER.register("life_energy_backpack", () -> new ItemLifeEnergyBackpack(CustomArmorMaterial.BACKPACK,new Item.Properties()));

    public static DeferredRegister<Block> getBlockDeferredRegister() {
        return BLOCK_DEFERRED_REGISTER;
    }

    public static DeferredRegister<Item> getItemDeferredRegister() {
        return ITEM_DEFERRED_REGISTER;
    }
}
