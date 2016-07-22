package com.wuest.prefab.Proxy.Messages;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class ChickenCoopTagMessage extends TagMessage 
{
	/**
	 * This class is just here to distinguish the house tag message from other messages in the mod.
	 */
	public ChickenCoopTagMessage(NBTTagCompound writeToNBTTagCompound) 
	{
		super(writeToNBTTagCompound);
	}

	public ChickenCoopTagMessage()
	{
		super();
	}
}
