package com.figvam.energies_awoken.block.breakdown_machine;

import com.figvam.energies_awoken.ModDetailReference;
import com.figvam.energies_awoken.util.EnumCompoundEnergy;
import com.figvam.energies_awoken.util.ItemCorrespondingCompoundEnergy;
import com.figvam.energies_awoken.util.compound_energy.CompoundEnergyProvider;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;

import java.util.ArrayList;
import java.util.HashMap;

public class GuiBreakdownMachine extends GuiContainer {



    private final int LEFT_BUTTON_ID = 0;
    private final int RIGHT_BUTTON_ID = 1;


    private static ResourceLocation guiBackground;
    TileEntityBreakdownMachine tileEntityBreakdownMachine;

    public GuiBreakdownMachine(InventoryPlayer player, TileEntityBreakdownMachine tileEntity){
        super(new ContainerBreakdownMachine(player,tileEntity));
        tileEntityBreakdownMachine = tileEntity;

        guiBackground = new ResourceLocation(ModDetailReference.MOD_ID + ":textures/gui/breakdown_machine/breakdown_machine.png");
    }

    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.add(new GuiButton( LEFT_BUTTON_ID, guiLeft + 35, guiTop + 54, 20, 20, "<"));
        this.buttonList.add(new GuiButton( RIGHT_BUTTON_ID, guiLeft + 65, guiTop + 54, 20, 20, ">"));

    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
        drawName();
        drawExistingCompoundEnergy();
        drawSelectedCompoundEnergy();


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

        int x = 80;
        int y = 35;

        if(!arrayListExistingEnergy.isEmpty()){

            for(EnumCompoundEnergy energy: arrayListExistingEnergy){

                String str = energy.toString() + "      " + tileEntityBreakdownMachine.compoundEnergyProvider.
                        getCapability(CompoundEnergyProvider.COMPOUND_ENERGY_CAPABILITY,null).getEnergy(energy);

                int strWidth = fontRenderer.getStringWidth(str);

                FontRenderer fontRenderer = FMLClientHandler.instance().getClient().fontRenderer;
                fontRenderer.drawString(str, x, y, 4210752);
                y += 10;

            }
        }


    }


    @Override
    protected void actionPerformed(GuiButton button)
    {
        //If the button id is different, or you have more buttons, create another if block for that too!
        if(button.id == LEFT_BUTTON_ID)
        {
            tileEntityBreakdownMachine.changeSelectedCompoundEnergy("left");
        }
        else if(button.id == RIGHT_BUTTON_ID){
            tileEntityBreakdownMachine.changeSelectedCompoundEnergy("right");
        }
    }


    private void drawSelectedCompoundEnergy(){

        if(!(tileEntityBreakdownMachine.selectedCompoundEnergy == null)){
            String str = tileEntityBreakdownMachine.selectedCompoundEnergy.toString();
            int strWidth = fontRenderer.getStringWidth(str);

            FontRenderer fontRenderer = FMLClientHandler.instance().getClient().fontRenderer;
            fontRenderer.drawString(str, 45, 40, 4210752);
        }


    }


}
