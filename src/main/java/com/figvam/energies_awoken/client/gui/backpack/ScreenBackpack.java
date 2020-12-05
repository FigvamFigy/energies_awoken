package com.figvam.energies_awoken.client.gui.backpack;

import com.figvam.energies_awoken.ModDetails;
import com.figvam.energies_awoken.common.item.backpack.ContainerBackpack;
import com.figvam.energies_awoken.util.Constants;
import com.figvam.energies_awoken.util.EnumLifeEnergy;
import com.figvam.energies_awoken.util.capability.life_energy.ILifeEnergyCapability;
import com.figvam.energies_awoken.util.capability.life_energy.LifeEnergyProvider;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.util.LazyOptional;

public class ScreenBackpack extends ContainerScreen<ContainerBackpack> {

    private static final ResourceLocation BACKPACK_TEXTURE = new ResourceLocation(ModDetails.MOD_ID + ":textures/gui/backpack/backpack.png");

    private int[] arrayEmptyTankCoordLeft = {44, 69};//x, y
    private int[] arrayEmptyTankCoordMiddle = {80, 69};
    private int[] arrayEmptyTankCoordRight = {116, 69};

    private int[] arrayBeastTankCoord = {176, 46};
    private int[] arrayDecayingTankCoord = {193, 46};
    private int[] arrayDemonicTankCoord = {210, 46};

    private final int TANK_HEIGHT = 47;
    private final int TANK_WIDTH = 16;

    ILifeEnergyCapability lifeEnergyCapability;
    ContainerBackpack containerBackpack;



    public ScreenBackpack(ContainerBackpack screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
        containerBackpack = screenContainer;

        ItemStack itemHeld = inv.getCurrentItem();
        LazyOptional<ILifeEnergyCapability> optionalHandler = itemHeld.getCapability(LifeEnergyProvider.LIFE_ENERGY_CAP);
        if (optionalHandler.isPresent()) {
            lifeEnergyCapability = optionalHandler.orElse(null);

        }
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(BACKPACK_TEXTURE);
        int screenWidthMiddle = (this.width - this.xSize) / 2;
        int screenHeightMiddle = (this.height - this.ySize) / 2;
        this.blit(screenWidthMiddle, screenHeightMiddle, 0, 0, this.xSize, this.ySize);

        drawTanks();

    }

    private void drawTanks() {
        int screenWidthMiddle = (this.width - this.xSize) / 2;
        int screenHeightMiddle = (this.height - this.ySize) / 2;

        if (lifeEnergyCapability != null) {
            //left beast
            double getPercentageFull = getPercentageFull(lifeEnergyCapability.getEnergy(EnumLifeEnergy.BEAST));
            this.blit(screenWidthMiddle + arrayEmptyTankCoordLeft[0], screenHeightMiddle + arrayEmptyTankCoordLeft[1],
                    arrayBeastTankCoord[0], arrayBeastTankCoord[1], TANK_WIDTH, -(int) (TANK_HEIGHT * getPercentageFull));

            //middle decaying
            getPercentageFull = getPercentageFull(lifeEnergyCapability.getEnergy(EnumLifeEnergy.DECAYING));
            this.blit(screenWidthMiddle + arrayEmptyTankCoordMiddle[0], screenHeightMiddle + arrayEmptyTankCoordMiddle[1],
                    arrayDecayingTankCoord[0], arrayDecayingTankCoord[1], TANK_WIDTH, -(int) (TANK_HEIGHT * getPercentageFull));

            //right demonic
            getPercentageFull = getPercentageFull(lifeEnergyCapability.getEnergy(EnumLifeEnergy.DEMONIC));
            this.blit(screenWidthMiddle + arrayEmptyTankCoordRight[0], screenHeightMiddle + arrayEmptyTankCoordRight[1],
                    arrayDemonicTankCoord[0], arrayDemonicTankCoord[1], TANK_WIDTH, -(int) (TANK_HEIGHT * getPercentageFull));


        }
    }


    private double getPercentageFull(double value) {
        double percentageFilled = value / Constants.BACKPACK_TANK_CAPACITY;
        return percentageFilled;
    }

}
