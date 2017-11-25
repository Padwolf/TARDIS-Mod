package com.codewolf.tardis.packet;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageTPos implements IMessage{
	
	private double posX, posY, posZ;
	private double motX, motY, motZ;
	
	@Override
	public void fromBytes(ByteBuf buf) {
		buf.writeDouble(posX);
		buf.writeDouble(posY);
		buf.writeDouble(posZ);
		buf.writeDouble(motX);
		buf.writeDouble(motY);
		buf.writeDouble(motZ);
		
	}

	@Override
	public void toBytes(ByteBuf buf) {
		posX = buf.readDouble();
		posY = buf.readDouble();
		posZ = buf.readDouble();
		motX = buf.readDouble();
		motY = buf.readDouble();
		motZ = buf.readDouble();
	}
	
	public static class Handler implements IMessageHandler<MessageTPos, IMessage>{

		@Override
		public IMessage onMessage(MessageTPos message, MessageContext ctx) {
			//ctx.getServerHandler().playerEntity.getServerWorld().addScheduledTask(ctx.getServerHandler().playerEntity.add)
			return null;
		}

	}

}
