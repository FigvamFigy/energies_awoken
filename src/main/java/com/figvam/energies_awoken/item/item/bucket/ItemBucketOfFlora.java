package com.figvam.energies_awoken.item.item.bucket;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBucketOfFlora extends Item {


    private static ItemBucketOfFlora instance = null;

    private ItemBucketOfFlora() {
        super();
        setCreativeTab(CreativeTabs.MISC);

        setUnlocalizedName("bucket_of_flora");
        setRegistryName("bucket_of_flora");

    }


    public static ItemBucketOfFlora getInstance(){
        if(instance == null){
            instance = new ItemBucketOfFlora();
        }
        return instance;
    }



}
