package com.ridebuilder5.oresplus.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NuclearBlocks extends BlockBase {

	public NuclearBlocks(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
        setHardness(5.0f);
        setResistance(7.5f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(0.7f);
        //setLightOpacity(1);
        //setBlockUnbreakable();
	}
}
