package com.ridebuilder5.oresplus.blocks.copper;

import com.ridebuilder5.oresplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperBlock extends BlockBase {

	public CopperBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(4.0f);
        setResistance(14.0f);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(0.1f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}
