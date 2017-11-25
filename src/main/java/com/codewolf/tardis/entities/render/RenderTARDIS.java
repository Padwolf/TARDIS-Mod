package com.codewolf.tardis.entities.render;

import com.codewolf.tardis.TardisMod;
import com.codewolf.tardis.entities.EntityTARDIS;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderTARDIS extends RenderLiving<EntityTARDIS>{
	protected ResourceLocation TardisTex;

    public RenderTARDIS(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn)
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);       
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityTARDIS entity) {
		// TODO Auto-generated method stub
		return new ResourceLocation("tardis:textures/entity/tardis.png");
	}
    
    
    
}
