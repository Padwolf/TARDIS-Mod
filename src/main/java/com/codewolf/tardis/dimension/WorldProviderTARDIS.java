package com.codewolf.tardis.dimension;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;

public class WorldProviderTARDIS extends WorldProvider {

	@Override
	public DimensionType getDimensionType() {
		return null;
	}
	
	@Override
	public BlockPos getSpawnPoint(){
		return new BlockPos(0, 0, 0);
    }
	
	@Override
	public IChunkGenerator createChunkGenerator(){
		return new ChunkProviderTARDIS(worldObj);
    }

}
