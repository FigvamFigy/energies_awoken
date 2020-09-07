package com.figvam.energies_awoken.item.item.life_energy_backpack.life_energy_backpack_level_one;

import com.figvam.energies_awoken.ModDetailReference;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
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
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
