package com.ridebuilder5.oresplus.blocks.silicon;

import com.ridebuilder5.oresplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SiliconOre extends BlockBase {

	public SiliconOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(7.0f);
		setResistance(17.0f);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0.1f);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
	}
}
