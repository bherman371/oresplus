package com.ridebuilder5.oresplus;

import com.ridebuilder5.oresplus.init.ModRecipes;
import com.ridebuilder5.oresplus.proxy.CommonProxy;
import com.ridebuilder5.oresplus.tabs.OresPlusBlocksTab;
import com.ridebuilder5.oresplus.tabs.OresPlusCombatTab;
import com.ridebuilder5.oresplus.tabs.OresPlusMaterialsTab;
import com.ridebuilder5.oresplus.tabs.OresPlusToolsTab;
import com.ridebuilder5.oresplus.util.Reference;
import com.ridebuilder5.oresplus.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main Instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs ORESPLUSBLOCKSTAB = new OresPlusBlocksTab("oresplusblockstab");
	public static final CreativeTabs ORESPLUSMATERIALSTAB = new OresPlusMaterialsTab("oresplusmaterialstab");
	public static final CreativeTabs ORESPLUSCOMBATTAB = new OresPlusCombatTab("orespluscombattab");
	public static final CreativeTabs ORESPLUSTOOLSTAB = new OresPlusToolsTab("oresplustoolstab");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
