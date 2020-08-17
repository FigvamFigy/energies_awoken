package com.figvam.energies_awoken.block.splitter.splitter_level_three;

import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.block.splitter.splitter_level_one.ContainerSplitterLevelOne;
import com.figvam.energies_awoken.block.splitter.splitter_level_one.TileEntitySplitterLevelOne;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiSplitterLevelThree extends GuiContainer {

    private static ResourceLocation guiBackground;
    private TileEntitySplitterLevelThree tileEntitySplitterLevelThree;


    public GuiSplitterLevelThree(InventoryPlayer inventoryPlayer, TileEntitySplitterLevelThree tileEntity) {
        super(new ContainerSplitterLevelThree(inventoryPlayer,tileEntity));

        tileEntitySplitterLevelThree = tileEntity;

        guiBackground = new ResourceLocation(ModDetailReference.MOD_ID + ":textures/gui/breakdown_machine/gui_breakdown_machine_level_one.png");
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        this.drawDefaultBackground();
        mc.getTextureManager().bindTexture(guiBackground);

        int middleX = (width / 2) - (xSize / 2);
        int middleY = (height / 2) - (ySize / 2);

        this.drawTexturedModalRect(middleX,middleY,0,0,this.xSize,ySize);
    }
}