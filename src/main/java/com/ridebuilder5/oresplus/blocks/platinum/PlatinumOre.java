package com.ridebuilder5.oresplus.blocks.platinum;

import com.ridebuilder5.oresplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PlatinumOre extends BlockBase {

	public PlatinumOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(6.5f);
        setResistance(18.5f);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(0.2f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}
