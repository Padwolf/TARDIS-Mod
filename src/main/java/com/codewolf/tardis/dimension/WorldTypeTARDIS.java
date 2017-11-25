package com.codewolf.tardis.dimension;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkGenerator;

public class WorldTypeTARDIS extends WorldType{

	public WorldTypeTARDIS(String name) {
		super(name);
	}
	
	@Override
    public IChunkGenerator getChunkGenerator(World world, String generatorOptions){
        return new ChunkProviderTARDIS(world);
    }
	

}