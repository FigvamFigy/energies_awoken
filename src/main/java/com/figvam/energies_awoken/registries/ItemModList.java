package com.figvam.energies_awoken.registries;

import com.figvam.energies_awoken.item.item.bucket.ItemBucketOfFlora;
import com.figvam.energies_awoken.item.item.geode.ItemBlueGeode;
import com.figvam.energies_awoken.item.item.geode.ItemPurpleGeode;
import com.figvam.energies_awoken.item.item.geode.ItemRedGeode;
import com.figvam.energies_awoken.item.item.life_energy_backpack.life_energy_backpack_level_one.ItemLifeEnergyBackpackLevelOne;
import com.figvam.energies_awoken.item.item.life_energy_backpack.ItemLifeEnergyBackpackLevelThree;
import com.figvam.energies_awoken.item.item.life_energy_backpack.ItemLifeEnergyBackpackLevelTwo;
import com.figvam.energies_awoken.item.item.solid_base_life_energy.ItemGroundingLifeEnergy;
import com.figvam.energies_awoken.item.item.syringe.ItemEmptySyringe;
import com.figvam.energies_awoken.item.item.vial.*;
import com.figvam.energies_awoken.item.itemBlock.breakDownMachine.ItemBlockBreakdownMachineLevelOne;
import com.figvam.energies_awoken.item.itemBlock.breakDownMachine.ItemBlockBreakdownMachineLevelThree;
import com.figvam.energies_awoken.item.itemBlock.breakDownMachine.ItemBlockBreakdownMachineLevelTwo;
import com.figvam.energies_awoken.item.itemBlock.essence_recombinator.ItemBlockEssenceRecombinatorLevelOne;
import com.figvam.energies_awoken.item.itemBlock.essence_recombinator.ItemBlockEssenceRecombinatorLevelThree;
import com.figvam.energies_awoken.item.itemBlock.essence_recombinator.ItemBlockEssenceRecombinatorLevelTwo;
import com.figvam.energies_awoken.item.itemBlock.extractor.ItemBlockExtractorLevelOne;
import com.figvam.energies_awoken.item.itemBlock.extractor.ItemBlockExtractorLevelThree;
import com.figvam.energies_awoken.item.itemBlock.extractor.ItemBlockExtractorLevelTwo;
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
            ItemBucketOfFlora.getInstance(),//Bucket of flora //0
            ItemBlueGeode.getInstance(),//Blue geode // 1
            ItemPurpleGeode.getInstance(),//Purple geode  //2
            ItemRedGeode.getInstance(),//Red geode //3
            ItemBlockBlueGeodeOre.getInstance(),//4
            ItemBlockPurpleGeodeOre.getInstance(),//5
            ItemBlockRedGeodeOre.getInstance(),//6
            ItemGroundingLifeEnergy.getInstance(),//7
            ItemBlockSplitterLevelOne.getInstance(),//8
            ItemBlockBreakdownMachineLevelOne.getInstance(),//9
            ItemBlockBreakdownMachineLevelTwo.getInstance(),//10
            ItemBlockBreakdownMachineLevelThree.getInstance(),//11
            ItemBlockSplitterLevelTwo.getInstance(),//12
            ItemBlockSplitterLevelThree.getInstance(),//13
            ItemBlockEssenceRecombinatorLevelOne.getInstance(),//14
            ItemBlockEssenceRecombinatorLevelTwo.getInstance(),//15
            ItemBlockEssenceRecombinatorLevelThree.getInstance(),//16
            ItemBlockExtractorLevelOne.getInstance(),//17
            ItemBlockExtractorLevelTwo.getInstance(),//18
            ItemBlockExtractorLevelThree.getInstance(),//19
            ItemEmptySyringe.getInstance(),//20
            ItemEmptyVial.getInstance(),//21
            ItemInfernalVial.getInstance(),//22
            ItemAquaVial.getInstance(),//23
            ItemBeastVial.getInstance(),//24
            ItemDecayingVial.getInstance(),//25
            ItemDemonicVial.getInstance(),//26
            ItemLightVial.getInstance(),//27
            ItemVoidVial.getInstance(),//28
            ItemCosmicFabricVial.getInstance(),//29
            ItemEldritchVial.getInstance(),//30
            ItemLifeEnergyBackpackLevelOne.getInstance(),//31
            ItemLifeEnergyBackpackLevelTwo.getInstance(),//32
            ItemLifeEnergyBackpackLevelThree.getInstance(),//33
            ItemVialPack.getInstance()//34
    };

}
