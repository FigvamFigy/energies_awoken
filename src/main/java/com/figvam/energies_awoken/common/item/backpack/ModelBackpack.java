package com.figvam.energies_awoken.common.item.backpack;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ModelBackpack<T extends LivingEntity> extends BipedModel<T> {

    private ModelRenderer mainBox;
    private ModelRenderer stairOne;
    private ModelRenderer stairTwo;

    public ModelBackpack() {
        super(0.0F);
        textureHeight = 32;
        textureWidth = 32;

        float centerX = -3.5F;
        float centerZ = 2F;
        float centerY = 2F;

        mainBox = new ModelRenderer(this, 0, 0);
        mainBox.setRotationPoint(0.0F, 0.0F, 0.0F);
        mainBox.addBox(centerX, 0, centerY, 7, 10, 4, 0.0F);

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
    protected Iterable<ModelRenderer> getHeadParts()
    {
        return ImmutableList.of();
    }

    @Override
    protected Iterable<ModelRenderer> getBodyParts()
    {
        return ImmutableList.of(this.mainBox);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        if(entityIn.isCrouching()){
            this.mainBox.rotationPointY = 3.2F;
            this.mainBox.rotateAngleX = 0.5F;
        }
    }

    public void setupAngles(BipedModel<T> model)
    {
        copyProperties(model.bipedBody, this.mainBox);
    }

    private static void copyProperties(ModelRenderer source, ModelRenderer target)
    {
        target.copyModelAngles(source);
    }
}
