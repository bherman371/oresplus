package com.ridebuilder5.oresplus.blocks.platinum;

import com.ridebuilder5.oresplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PlatinumBlock extends BlockBase {

	public PlatinumBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(7.5f);
        setResistance(20.0f);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(0.2f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}
