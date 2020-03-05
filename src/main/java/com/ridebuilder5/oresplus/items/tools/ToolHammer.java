package com.ridebuilder5.oresplus.items.tools;

import com.ridebuilder5.oresplus.Main;
import com.ridebuilder5.oresplus.init.ModItems;
import com.ridebuilder5.oresplus.items.ItemHammer;
import com.ridebuilder5.oresplus.util.IHasModel;

import net.minecraft.item.Item.ToolMaterial;

public class ToolHammer extends ItemHammer implements IHasModel {

	public ToolHammer(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ORESPLUSTOOLSTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
