package com.ridebuilder5.oresplus.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.oresplus.blocks.FranciumBlock;
import com.ridebuilder5.oresplus.blocks.NuclearBlocks;
import com.ridebuilder5.oresplus.blocks.SteelBlock;
import com.ridebuilder5.oresplus.blocks.aluminum.AluminumBlock;
import com.ridebuilder5.oresplus.blocks.aluminum.AluminumOre;
import com.ridebuilder5.oresplus.blocks.atomic.AtomicBlock;
import com.ridebuilder5.oresplus.blocks.atomic.AtomicOre;
import com.ridebuilder5.oresplus.blocks.copper.CopperBlock;
import com.ridebuilder5.oresplus.blocks.copper.CopperOre;
import com.ridebuilder5.oresplus.blocks.future.FutureBlock;
import com.ridebuilder5.oresplus.blocks.future.FutureOre;
import com.ridebuilder5.oresplus.blocks.lead.LeadBlock;
import com.ridebuilder5.oresplus.blocks.lead.LeadOre;
import com.ridebuilder5.oresplus.blocks.nickel.NickelBlock;
import com.ridebuilder5.oresplus.blocks.nickel.NickelOre;
import com.ridebuilder5.oresplus.blocks.platinum.PlatinumBlock;
import com.ridebuilder5.oresplus.blocks.platinum.PlatinumOre;
import com.ridebuilder5.oresplus.blocks.silicon.SiliconBlock;
import com.ridebuilder5.oresplus.blocks.silicon.SiliconOre;
import com.ridebuilder5.oresplus.blocks.silver.SilverBlock;
import com.ridebuilder5.oresplus.blocks.silver.SilverOre;
import com.ridebuilder5.oresplus.blocks.tellurium.TelluriumBlock;
import com.ridebuilder5.oresplus.blocks.tellurium.TelluriumOre;
import com.ridebuilder5.oresplus.blocks.tin.TinBlock;
import com.ridebuilder5.oresplus.blocks.tin.TinOre;
import com.ridebuilder5.oresplus.blocks.titanium.TitaniumBlock;
import com.ridebuilder5.oresplus.blocks.titanium.TitaniumOre;
import com.ridebuilder5.oresplus.blocks.uranium.UraniumBlock;
import com.ridebuilder5.oresplus.blocks.uranium.UraniumOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block FUTURE_ORE = new FutureOre("future_ore", Material.ROCK);
	public static final Block FUTURE_BLOCK = new FutureBlock("future_block", Material.IRON);
	
	public static final Block ATOMIC_ORE = new AtomicOre("atomic_ore", Material.ROCK);
	public static final Block ATOMIC_BLOCK = new AtomicBlock("atomic_block", Material.ROCK);
	
	public static final Block STEEL_BLOCK = new SteelBlock("steel_block", Material.IRON);
	
	public static final Block TELLURIUM_ORE = new TelluriumOre("tellurium_ore", Material.ROCK);
	public static final Block TELLURIUM_BLOCK = new TelluriumBlock("tellurium_block", Material.IRON);
	
	public static final Block TITANIUM_ORE = new TitaniumOre("titanium_ore", Material.ROCK);
	public static final Block TITANIUM_BLOCK = new TitaniumBlock("titanium_block", Material.IRON);
	
	public static final Block FRANCIUM_BLOCK = new FranciumBlock("francium_block", Material.SAND);
	
	public static final Block URANIUM_ORE = new UraniumOre("uranium_ore", Material.ROCK);
	public static final Block URANIUM_BLOCK = new UraniumBlock("uranium_block", Material.ROCK);
	
	public static final Block NEPTUNIUM_BLOCK = new NuclearBlocks("neptunium_block", Material.IRON);
	public static final Block PLUTONIUM_BLOCK = new NuclearBlocks("plutonium_block", Material.IRON);
	public static final Block AMERICIUM_BLOCK = new NuclearBlocks("americium_block", Material.IRON);
	public static final Block CURIUM_BLOCK = new NuclearBlocks("curium_block", Material.IRON);
	
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	
	public static final Block NICKEL_ORE = new NickelOre("nickel_ore", Material.ROCK);
	public static final Block NICKEL_BLOCK = new NickelBlock("nickel_block", Material.IRON);
	
	public static final Block PLATINUM_ORE = new PlatinumOre("platinum_ore", Material.ROCK);
	public static final Block PLATINUM_BLOCK = new PlatinumBlock("platinum_block", Material.IRON);
	
	public static final Block SILVER_ORE = new SilverOre("silver_ore", Material.ROCK);
	public static final Block SILVER_BLOCK = new SilverBlock("silver_block", Material.IRON);
	
	public static final Block ALUMINUM_ORE = new AluminumOre("aluminum_ore", Material.ROCK);
	public static final Block ALUMINUM_BLOCK = new AluminumBlock("aluminum_block", Material.IRON);
	
	public static final Block LEAD_ORE = new LeadOre("lead_ore", Material.ROCK);
	public static final Block LEAD_BLOCK = new LeadBlock("lead_block", Material.IRON);
	
	public static final Block SILICON_ORE = new SiliconOre("silicon_ore", Material.ROCK);
	public static final Block SILICON_BLOCK = new SiliconBlock("silicon_block", Material.IRON);
	
	public static final Block TIN_ORE = new TinOre("tin_ore", Material.ROCK);
	public static final Block TIN_BLOCK = new TinBlock("tin_block", Material.IRON);
}
