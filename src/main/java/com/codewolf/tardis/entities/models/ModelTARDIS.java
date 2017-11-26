package com.codewolf.tardis.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelTARDIS extends ModelBase {
	private ModelRenderer body;

	public ModelTARDIS() {

		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this, 0, 0);
		body.addBox(-8, -16, -8, 16, 32, 16);
		body.setTextureSize(textureWidth, textureHeight);
		body.setTextureOffset(0, 0);
		setRotation(body, 0, 0, 0);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		body.render(scale);
	}

	protected void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
