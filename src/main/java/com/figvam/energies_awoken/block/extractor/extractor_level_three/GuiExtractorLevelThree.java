package com.figvam.energies_awoken.block.extractor.extractor_level_three;

import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.block.extractor.extractor_level_one.ContainerExtractorLevelOne;
import com.figvam.energies_awoken.block.extractor.extractor_level_one.TileEntityExtractorLevelOne;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiExtractorLevelThree extends GuiContainer {

    private static ResourceLocation guiBackground;
    private TileEntityExtractorLevelThree tileEntityExtractorLevelThree;


    public GuiExtractorLevelThree(InventoryPlayer inventoryPlayer, TileEntityExtractorLevelThree tileEntity) {
        super(new ContainerExtractorLevelThree(inventoryPlayer,tileEntity));

        tileEntityExtractorLevelThree = tileEntity;

        guiBackground = new ResourceLocation(ModDetailReference.MOD_ID + ":textures/gui/extractor/gui_extractor_level_one.png");
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
