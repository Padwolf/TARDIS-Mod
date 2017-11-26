package com.codewolf.tardis.proxy;

import com.codewolf.tardis.TardisMod;
import com.codewolf.tardis.dimension.WorldProviderTARDIS;
import com.codewolf.tardis.entities.EntityTARDIS;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ProxyCommon {

	public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {
    	DimensionType.register("TARDIS", "_tardis", DimensionManager.getNextFreeDimId(), WorldProviderTARDIS.class, true);
    	EntityRegistry.registerModEntity(EntityTARDIS.class, TardisMod.MODID, 0, TardisMod.MODID, 64, 1, true, 0x0000ff, 0x000000);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
