package com.ridebuilder5.oresplus.blocks.silicon;

import com.ridebuilder5.oresplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SiliconBlock extends BlockBase {

	public SiliconBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(8.0f);
		setResistance(19.0f);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0.1f);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
	}
}
