package com.figvam.energies_awoken.common.item.vial;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemEmptyVial extends Item {

    public ItemEmptyVial(Properties properties) {
        super(properties.group(ItemGroup.MATERIALS));
    }
}
