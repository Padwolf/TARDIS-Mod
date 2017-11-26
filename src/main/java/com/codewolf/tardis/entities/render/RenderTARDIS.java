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
	
	@Override
	public void doRender(EntityTARDIS entity, double x, double y, double z, float entityYaw, float partialTicks) {
		bindTexture(new ResourceLocation("tardis:textures/entity/tardis.png"));
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}
}
