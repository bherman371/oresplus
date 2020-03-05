package com.ridebuilder5.oresplus.tabs;

import com.ridebuilder5.oresplus.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OresPlusToolsTab extends CreativeTabs {

	public OresPlusToolsTab(String label) {
		super("oresplustoolstab");
		this.setBackgroundImageName("oresplustools.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FUTURE_AXE);
	}
}
