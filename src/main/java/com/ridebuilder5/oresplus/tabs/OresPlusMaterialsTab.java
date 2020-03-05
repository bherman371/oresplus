package com.ridebuilder5.oresplus.tabs;

import com.ridebuilder5.oresplus.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OresPlusMaterialsTab extends CreativeTabs {

	public OresPlusMaterialsTab(String label) {
		super("oresplusmaterialstab");
		this.setBackgroundImageName("oresplusmaterials.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FUTURE_INGOT);
	}
}
