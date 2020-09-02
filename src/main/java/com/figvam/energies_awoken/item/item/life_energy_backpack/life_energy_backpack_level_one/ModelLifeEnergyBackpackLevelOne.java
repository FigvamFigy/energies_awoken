package com.figvam.energies_awoken.item.item.life_energy_backpack.life_energy_backpack_level_one;


import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.util.vector.Quaternion;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Map;

public class ModelLifeEnergyBackpackLevelOne extends ModelBiped {


    private ModelRenderer mainBox;
    private ModelRenderer stairOne;
    private ModelRenderer stairTwo;

    //A model is made up of boxes. We then specify the top left corner of the box's texture in the texture atlas(the big texture that holds everything for this backpack)
    //and then it will be rendered and textured here
    public ModelLifeEnergyBackpackLevelOne(){
        super(0.0F);
        textureHeight = 32;
        textureWidth = 32;

        float centerX = -3.5F;
        float centerZ = 2F;
        float centerY = 2F;

        mainBox = new ModelRenderer(this,0,18);
        mainBox.addBox(centerX, centerY, centerZ, 7, 10, 4, 0.0F);
        mainBox.setRotationPoint(0.0F, 0.0F, 0.0F);

        stairOne = new ModelRenderer(this,0,13);
        stairOne.addBox(centerX,-1.0F + centerY,centerZ,7,1,3,0.0F);

        stairTwo = new ModelRenderer(this,0,9);
        stairTwo.addBox(centerX,-2.0F + centerY,centerZ,7,1,2,0.0F);

        mainBox.addChild(stairOne);
        mainBox.addChild(stairTwo);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if(entityIn.isSneaking())
        {

            String skinType = ((AbstractClientPlayer)entityIn).getSkinType();

            Map<String, RenderPlayer> skinMap = Minecraft.getMinecraft().getRenderManager().getSkinMap();
            RenderPlayer playerModelRender;

            if(skinType.equals("default")){
                playerModelRender = skinMap.get("default");
            }
            else {
                playerModelRender = skinMap.get("slim");
            }


            setSneakingAngles(playerModelRender.getMainModel().bipedBody,mainBox);
            setSneakingAngles(playerModelRender.getMainModel().bipedBody,mainBox);

            GlStateManager.translate(0.0F, 0.2F, 0.0F);


        }

        mainBox.render(scale);
    }

    //We copy the properties of the player's angles when its sneaking so we can set the same angles for the backpack
    private static void setSneakingAngles(ModelRenderer source, ModelRenderer target)
    {
        target.rotateAngleX = source.rotateAngleX;
        target.rotateAngleY = source.rotateAngleY;
        target.rotateAngleZ = source.rotateAngleZ;
        target.offsetX = source.offsetX;
        target.offsetY = source.offsetY;
        target.offsetZ = source.offsetZ;
        target.rotationPointX = source.rotationPointX;
        target.rotationPointY = source.rotationPointY;
        target.rotationPointZ = source.rotationPointZ;

    }

}
