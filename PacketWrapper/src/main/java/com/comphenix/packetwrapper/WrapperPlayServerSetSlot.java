package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.inventory.ItemStack;

public class WrapperPlayServerSetSlot extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_SLOT;

    public WrapperPlayServerSetSlot() {
        super(TYPE);
    }

    public WrapperPlayServerSetSlot(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getStateId() {
        return this.handle.getIntegers().read(1);
    }

    public void setStateId(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public int getSlot() {
        return this.handle.getIntegers().read(2);
    }

    public void setSlot(int value) {
        this.handle.getIntegers().write(2, value);
    }

    public ItemStack getItemStack() {
        return this.handle.getItemModifier().read(0);
    }

    public void setItemStack(ItemStack value) {
        this.handle.getItemModifier().write(0, value);
    }


}
