package com.figvam.energies_awoken.block.breakdown_machine;

import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.util.EnumCompoundEnergy;
import com.figvam.energies_awoken.util.ItemCorrespondingCompoundEnergy;
import com.figvam.energies_awoken.util.compound_energy.CompoundEnergyProvider;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;

import java.util.ArrayList;
import java.util.HashMap;

public class GuiBreakdownMachine extends GuiContainer {


    private static ResourceLocation guiBackground;
    TileEntityBreakdownMachine tileEntityBreakdownMachine;

    public GuiBreakdownMachine(InventoryPlayer player, TileEntityBreakdownMachine tileEntity){
        super(new ContainerBreakdownMachine(player,tileEntity));
        tileEntityBreakdownMachine = tileEntity;

        guiBackground = new ResourceLocation(ModDetailReference.MOD_ID + ":textures/gui/breakdown_machine/breakdown_machine.png");
    }


    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
        drawName();
        drawExistingCompoundEnergy();

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


    private void drawName(){
        String str = "Breakdown Machine";
        int strWidth = fontRenderer.getStringWidth(str);

        FontRenderer fontRenderer = FMLClientHandler.instance().getClient().fontRenderer;
        fontRenderer.drawString(str, 35, 5, 4210752);
    }

    private void drawExistingCompoundEnergy(){
        ArrayList<EnumCompoundEnergy> arrayListExistingEnergy = tileEntityBreakdownMachine.compoundEnergyProvider.
                getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null).getExistingCompoundLifeEnergy();

        HashMap<EnumCompoundEnergy,String> hashMapEnergyString = new HashMap<>();



        if(!arrayListExistingEnergy.isEmpty()){

            for(EnumCompoundEnergy energy: arrayListExistingEnergy){

                String str = energy.toString() + "      " + tileEntityBreakdownMachine.compoundEnergyProvider.
                        getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null).getEnergy(energy);

                int strWidth = fontRenderer.getStringWidth(str);

                FontRenderer fontRenderer = FMLClientHandler.instance().getClient().fontRenderer;
                fontRenderer.drawString(str, 80, 35, 4210752);

            }
        }


    }


}
