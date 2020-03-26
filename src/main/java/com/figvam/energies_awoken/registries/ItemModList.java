package com.figvam.energies_awoken.registries;

import com.figvam.energies_awoken.item.itemBlock.breakDownMachine.ItemBlockBreadownMachine;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemModList {


    public static final Item[] ITEMS = {
            ItemBlockBreadownMachine.getInstance()
    };

}
