package com.ridebuilder5.oresplus.tabs;

import com.ridebuilder5.oresplus.init.ModBlocks;
import com.ridebuilder5.oresplus.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OresPlusCombatTab extends CreativeTabs {

	public OresPlusCombatTab(String label) {
		super("orespluscombattab");
		this.setBackgroundImageName("orespluscombat.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FUTURE_SWORD);
	}
}
