package com.codewolf.tardis.proxy;

import com.codewolf.tardis.entities.EntityTARDIS;
import com.codewolf.tardis.entities.render.RenderTARDIS;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ProxyClient extends ProxyCommon {

	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
        RenderingRegistry.registerEntityRenderingHandler(EntityTARDIS.class, RenderTARDIS.FACTORY);
    }

    public void init(FMLInitializationEvent e) {
    	super.init(e);
    }

    public void postInit(FMLPostInitializationEvent e) {
    	super.postInit(e);
    }
}
