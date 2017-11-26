package com.codewolf.tardis.entities.render;

import com.codewolf.tardis.TardisMod;
import com.codewolf.tardis.entities.EntityTARDIS;
import com.codewolf.tardis.entities.models.ModelTARDIS;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderTARDIS extends RenderLiving<EntityTARDIS>{

	public static Factory FACTORY = new Factory();
	private static final ResourceLocation TARDIS_TEXTURE = new ResourceLocation(TardisMod.MODID, "textures/entity/tardis.png");

    public RenderTARDIS(RenderManager rendermanagerIn)
    {
        super(rendermanagerIn, new ModelTARDIS(), 0.5F);
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityTARDIS entity) {
		return TARDIS_TEXTURE;
	}
	
	private static class Factory implements IRenderFactory<EntityTARDIS> {

		@Override
		public Render<? super EntityTARDIS> createRenderFor(RenderManager manager) {
			return new RenderTARDIS(manager);
		}
	}
}
