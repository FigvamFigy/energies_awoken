package com.figvam.energies_awoken.block.breakdown_machine;

import com.figvam.energies_awoken.ModDetailReference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiBreakdownMachine extends GuiContainer {


    private static ResourceLocation guiBackground;

    public GuiBreakdownMachine(InventoryPlayer player, TileEntityBreakdownMachine tileEntity){
        super(new ContainerBreakdownMachine(player,tileEntity));

        guiBackground = new ResourceLocation(ModDetailReference.MOD_ID + ":textures/gui/breakdown_machine/breakdown_machine.png");
    }


    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        this.drawDefaultBackground();
        mc.getTextureManager().bindTexture(guiBackground);

        int middleX = (width / 2) - (xSize / 2);
        int middleY = (height / 2) - (ySize / 2);

        //xSize = 176;
        //ySize = 166;

        this.drawTexturedModalRect(middleX,middleY,0,0,this.xSize,ySize);

    }
}
