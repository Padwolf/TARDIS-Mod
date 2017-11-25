package com.codewolf.tardis.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelTARDIS extends ModelBase {
	public ModelRenderer body;
	
	public ModelTARDIS() {
		body = new ModelRenderer(this, 0, 0);
		body.addBox(-8, -8, -16, 16, 16, 32);
		setRotation(body, 0, 0, 0);
		
		textureWidth = 64;
		textureHeight = 48;
		
		body.setTextureOffset(0, 0);
		
	}
	
	protected float degToRad(float degrees)
    {
        return degrees * (float)Math.PI / 180f;
    }
	
	protected void setRotation(ModelRenderer model, float rotX, float rotY, float rotZ)
    {
        model.rotateAngleX = degToRad(rotX);
        model.rotateAngleY = degToRad(rotY);
        model.rotateAngleZ = degToRad(rotZ);
    }
}
