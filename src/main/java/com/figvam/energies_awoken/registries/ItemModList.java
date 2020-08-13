package com.figvam.energies_awoken.registries;

import com.figvam.energies_awoken.item.item.bucket.ItemBucketOfFlora;
import com.figvam.energies_awoken.item.item.geode.ItemBlueGeode;
import com.figvam.energies_awoken.item.item.geode.ItemPurpleGeode;
import com.figvam.energies_awoken.item.item.geode.ItemRedGeode;
import com.figvam.energies_awoken.item.item.solid_base_life_energy.ItemGroundingLifeEnergy;
import com.figvam.energies_awoken.item.itemBlock.breakDownMachine.ItemBlockBreakdownMachineLevelOne;
import com.figvam.energies_awoken.item.itemBlock.breakDownMachine.ItemBlockBreakdownMachineLevelThree;
import com.figvam.energies_awoken.item.itemBlock.breakDownMachine.ItemBlockBreakdownMachineLevelTwo;
import com.figvam.energies_awoken.item.itemBlock.geode.ItemBlockBlueGeodeOre;
import com.figvam.energies_awoken.item.itemBlock.geode.ItemBlockPurpleGeodeOre;
import com.figvam.energies_awoken.item.itemBlock.geode.ItemBlockRedGeodeOre;
import com.figvam.energies_awoken.item.itemBlock.splitter.ItemBlockSplitterLevelOne;
import com.figvam.energies_awoken.item.itemBlock.splitter.ItemBlockSplitterLevelThree;
import com.figvam.energies_awoken.item.itemBlock.splitter.ItemBlockSplitterLevelTwo;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemModList {


    public static final Item[] ITEMS = {
            //ItemBlockBreadownMachine.getInstance(),//Break down machine
            ItemBucketOfFlora.getInstance(),//Bucket of flora
            ItemBlueGeode.getInstance(),//Blue geode
            ItemPurpleGeode.getInstance(),//Purple geode
            ItemRedGeode.getInstance(),//Red geode
            ItemBlockBlueGeodeOre.getInstance(),
            ItemBlockPurpleGeodeOre.getInstance(),
            ItemBlockRedGeodeOre.getInstance(),
            ItemGroundingLifeEnergy.getInstance(),
            ItemBlockSplitterLevelOne.getInstance(),
            ItemBlockBreakdownMachineLevelOne.getInstance(),
            ItemBlockBreakdownMachineLevelTwo.getInstance(),
            ItemBlockBreakdownMachineLevelThree.getInstance(),
            ItemBlockSplitterLevelTwo.getInstance(),
            ItemBlockSplitterLevelThree.getInstance()
    };

}
