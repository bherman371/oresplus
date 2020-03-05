package com.ridebuilder5.oresplus.blocks.silver;

import com.ridebuilder5.oresplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SilverOre extends BlockBase {

	public SilverOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(4.0f);
        setResistance(16.0f);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(0.3f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}
