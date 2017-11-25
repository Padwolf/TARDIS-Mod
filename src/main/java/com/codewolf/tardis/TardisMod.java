package com.codewolf.tardis;

import com.codewolf.tardis.proxy.ProxyCommon;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = TardisMod.MODID, version = TardisMod.VERSION)
public class TardisMod
{
	@Instance("TARDIS")
	public static TardisMod instance;
	
    public static final String MODID = "tardis";
    public static final String VERSION = "1.0";
    
    @SidedProxy(clientSide="com.codewolf.tardis.proxy.ProxyClient", serverSide="com.codewolf.tardis.proxy.ProxyCommon")
    public static ProxyCommon proxy;
    
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
}
