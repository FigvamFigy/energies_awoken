package com.figvam.energies_awoken.item.item.life_energy_backpack.life_energy_backpack_level_one;

import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.EnumLifeEnergy;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.ILifeEnergy;
import com.figvam.energies_awoken.util.custom_capabilities.life_energy.LifeEnergyProvider;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class GuiLifeEnergyBackpackLevelOne extends GuiScreen {

    private static ResourceLocation guiBackground;

    public GuiLifeEnergyBackpackLevelOne() {
        super();

        guiBackground = new ResourceLocation(ModDetailReference.MOD_ID + ":textures/gui/backpack/backpack.png");
    }


    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();


        mc.getTextureManager().bindTexture(guiBackground);

        int xSize = 176;
        int ySize = 106;
        int middleX = (width / 2) - (xSize / 2);
        int middleY = (height / 2) - (ySize / 2);
        this.drawTexturedModalRect(middleX, middleY, 0, 0, xSize, ySize);
        super.drawScreen(mouseX, mouseY, partialTicks);


        ILifeEnergy lifeEnergy = ItemLifeEnergyBackpackLevelOne.getInstance().lifeEnergyProvider.getCapability(LifeEnergyProvider.LIFE_ENERGY_CAPABILITY,null);

        this.drawTexturedModalRect(middleX + 45,middleY + 78 - getFullTankHeight(),176,1,16,getFullTankHeight());

    }


    private int getFullTankHeight(){
        //max height = 49
        //max tank cap = 1000

        ILifeEnergy lifeEnergy = ItemLifeEnergyBackpackLevelOne.getInstance().lifeEnergyProvider.getCapability(LifeEnergyProvider.LIFE_ENERGY_CAPABILITY,null);

        double percentageFilled = lifeEnergy.getEnergyValue(EnumLifeEnergy.beast) / 100.0;

        int test = (int) ((int) 47 * percentageFilled);
        return (int) ((int) 47 * percentageFilled);

    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }


}
