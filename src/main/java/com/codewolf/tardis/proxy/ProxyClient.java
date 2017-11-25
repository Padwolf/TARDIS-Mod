package com.codewolf.tardis.proxy;

import com.codewolf.tardis.entities.EntityTARDIS;
import com.codewolf.tardis.entities.models.ModelTARDIS;
import com.codewolf.tardis.entities.render.RenderTARDIS;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ProxyClient extends ProxyCommon{
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
    }

    public void init(FMLInitializationEvent e) {
    	super.init(e);
    	RenderingRegistry.registerEntityRenderingHandler(EntityTARDIS.class, 
			      new RenderTARDIS(Minecraft.getMinecraft().getRenderManager(), new ModelTARDIS(), 0.5F));
    }

    public void postInit(FMLPostInitializationEvent e) {
    	super.postInit(e);
    }
}
