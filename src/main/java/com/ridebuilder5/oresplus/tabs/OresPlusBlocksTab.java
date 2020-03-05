package com.ridebuilder5.oresplus.tabs;

import com.ridebuilder5.oresplus.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OresPlusBlocksTab extends CreativeTabs {

	public OresPlusBlocksTab(String label) {
		super("oresplusblockstab");
		this.setBackgroundImageName("oresplusblocks.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.FUTURE_ORE);
	}
}
