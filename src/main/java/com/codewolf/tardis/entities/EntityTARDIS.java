package com.codewolf.tardis.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import scala.swing.TextComponent;

public class EntityTARDIS extends EntityLiving{
	
	private EntityPlayer owner;
	private EntityPlayer rider;
	private boolean isFlying = false;
	private double mSpeed = 3, mRotSpeed = 1;
	private int dimension;
	
	double ramp = 0;
	
	public EntityTARDIS(World worldIn) {
		super(worldIn);
		setSize(1, 2);
		
		
		//DimensionManager.registerDimension(dimension = DimensionManager.getNextFreeDimId(), DimensionType.OVERWORLD);
		
		
	}
	
	@Override
	public boolean isEntityInvulnerable(DamageSource source) {
		return true;
	}
	
	@Override
	public boolean canBePushed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean canBeLeashedTo(EntityPlayer player) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	protected boolean canDespawn() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public EnumActionResult applyPlayerInteraction(EntityPlayer player, Vec3d vec, ItemStack stack, EnumHand hand) {
		
		if (owner == null) {
			owner = player;
		}
		
		if (player.isSneaking()) {
			addChatMessage(owner.getDisplayName());
		} else {
			if (rider == null) {
				player.setInvisible(true);
				player.startRiding(this);
				rider = player;
				isFlying = true;
			}
		}
		
		return super.applyPlayerInteraction(player, vec, stack, hand);
	}
	
//	@Override
//	public void onCollideWithPlayer(EntityPlayer entityIn) {
//		if (!entityIn.isSneaking()) {
//			entityIn.changeDimension(dimension);
//		}
//	}
	
	@Override
	public boolean hasNoGravity() {
		return isFlying;
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		setNoGravity(isFlying);
		if (rider != null) {
			if (rider.isSneaking()) {
				rider.setInvisible(false);
				dismountRidingEntity();
				rider = null;
				isFlying = false;
				return;
			}
			
			if (rider.moveForward > 0.0005) {
				ramp += 0.004;
				if (ramp > 1) ramp = 1;
			} else if (rider.moveForward < -0.0005) {
				ramp -= 0.004;
				if (ramp < -1) ramp = -1;
			} else {
				if (ramp > 0.004) ramp -= 0.004;
				else if (ramp < -0.004) ramp += 0.004;
				else ramp = 0;
			}
			
			setVelocity(rider.getLookVec().xCoord * ramp * mSpeed, rider.getLookVec().yCoord * ramp * mSpeed,
					rider.getLookVec().zCoord * ramp * mSpeed);
			
			setRotation((float) (rotationYaw + (ramp * mRotSpeed)), rotationPitch);
			
//			System.out.println("Y: " + rider.getLookVec().yCoord);
//			System.out.println("Z: " + rider.getLookVec().zCoord);
			
			//setVelocity(x, y, z);
//			
//			motionX = Math.sin(rider.rotationYawHead) * rider.moveForward * mSpeed;
//			motionY = Math.sin(rider.rotationPitch) * rider.moveForward;
//			motionX = Math.cos(rider.rotationYawHead) * -rider.moveStrafing * mSpeed;
			
		}
	}
	
}
