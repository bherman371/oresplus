package com.ridebuilder5.oresplus.blocks.nickel;

import com.ridebuilder5.oresplus.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NickelBlock extends BlockBase {

	public NickelBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
        setHardness(6.0f);
        setResistance(18.5f);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(0.1f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}
