package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.inventory.ItemStack;

public class WrapperPlayClientSetCreativeSlot extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.SET_CREATIVE_SLOT;

    public WrapperPlayClientSetCreativeSlot() {
        super(TYPE);
    }

    public WrapperPlayClientSetCreativeSlot(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getSlotNum() {
        return this.handle.getIntegers().read(0);
    }

    public void setSlotNum(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public ItemStack getItemStack() {
        return this.handle.getItemModifier().read(0);
    }

    public void setItemStack(ItemStack value) {
        this.handle.getItemModifier().write(0, value);
    }


}
