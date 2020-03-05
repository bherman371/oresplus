package com.ridebuilder5.oresplus.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.FUTURE_ORE, new ItemStack(ModItems.FUTURE_INGOT, 1), 1.5f);
		
		GameRegistry.addSmelting(ModBlocks.ATOMIC_ORE, new ItemStack(ModItems.ATOMIC_DUST, 1), 1.0f);
		
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(ModItems.STEEL_BAR, 1), 3.0f);
		
		GameRegistry.addSmelting(ModBlocks.TELLURIUM_ORE, new ItemStack(ModItems.TELLURIUM_INGOT, 1), 2.5f);
		
		GameRegistry.addSmelting(ModBlocks.TITANIUM_ORE, new ItemStack(ModItems.TITANIUM_INGOT, 1), 3.5f);
		
		GameRegistry.addSmelting(Blocks.STONE, new ItemStack(ModItems.FRANCIUM_INGOT, 1), 3.0f);
		
		GameRegistry.addSmelting(ModBlocks.URANIUM_ORE, new ItemStack(ModItems.URANIUM_INGOT, 1), 4.0f);
		
		GameRegistry.addSmelting(ModItems.URANIUM_INGOT, new ItemStack(ModItems.NEPTUNIUM_INGOT, 1), 3.0f);
		GameRegistry.addSmelting(ModItems.NEPTUNIUM_INGOT, new ItemStack(ModItems.PLUTONIUM_INGOT, 1), 3.0f);
		GameRegistry.addSmelting(ModItems.PLUTONIUM_INGOT, new ItemStack(ModItems.AMERICIUM_INGOT, 1), 3.0f);
		GameRegistry.addSmelting(ModItems.AMERICIUM_INGOT, new ItemStack(ModItems.CURIUM_INGOT, 1), 3.0f);
		
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT, 1), 2.0f);
		
		GameRegistry.addSmelting(ModBlocks.NICKEL_ORE, new ItemStack(ModItems.NICKEL_INGOT, 1), 3.0f);
		
		GameRegistry.addSmelting(ModBlocks.PLATINUM_ORE, new ItemStack(ModItems.PLATINUM_INGOT, 1), 4.0f);
		
		GameRegistry.addSmelting(ModBlocks.SILVER_ORE, new ItemStack(ModItems.SILVER_INGOT, 1), 2.5f);
		
		GameRegistry.addSmelting(ModBlocks.ALUMINUM_ORE, new ItemStack(ModItems.ALUMINUM_INGOT, 1), 2.0f);
		
		GameRegistry.addSmelting(ModBlocks.LEAD_ORE, new ItemStack(ModItems.LEAD_INGOT, 1), 2.0f);
		
		GameRegistry.addSmelting(ModBlocks.SILICON_ORE, new ItemStack(ModItems.SILICON_INGOT, 1), 2.5f);
		
		GameRegistry.addSmelting(ModBlocks.TIN_ORE, new ItemStack(ModItems.TIN_INGOT, 1), 2.0f);
	}
}
