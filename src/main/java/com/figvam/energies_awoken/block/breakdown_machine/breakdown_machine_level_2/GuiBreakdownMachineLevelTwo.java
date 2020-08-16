package com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_2;

import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.block.breakdown_machine.breakdown_machine_level_1.TileEntityBreakdownMachineLevelOne;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiBreakdownMachineLevelTwo extends GuiContainer {


    private static ResourceLocation guiBackground;
    private TileEntityBreakdownMachineLevelTwo tileEntityBreakdownMachineLevelTwo;

    public GuiBreakdownMachineLevelTwo(InventoryPlayer inventoryPlayer, TileEntityBreakdownMachineLevelTwo tileEntity) {
        super(new ContainerBreakdownMachineLevelTwo(inventoryPlayer,tileEntity));

        tileEntityBreakdownMachineLevelTwo = tileEntity;

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
