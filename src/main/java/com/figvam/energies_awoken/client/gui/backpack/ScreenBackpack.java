package com.figvam.energies_awoken.client.gui.backpack;

import com.figvam.energies_awoken.ModDetails;
import com.figvam.energies_awoken.common.item.backpack.ContainerBackpack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class ScreenBackpack extends ContainerScreen<ContainerBackpack> {


    private static final ResourceLocation DISPENSER_GUI_TEXTURES = new ResourceLocation(ModDetails.MOD_ID + ":textures/gui/backpack/backpack.png");

    public ScreenBackpack(ContainerBackpack screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);




    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(DISPENSER_GUI_TEXTURES);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.blit(i, j, 0, 0, this.xSize, this.ySize);
    }
}
