package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BukkitConverters;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class WrapperPlayServerWindowItems extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.WINDOW_ITEMS;

    public WrapperPlayServerWindowItems() {
        super(TYPE);
    }

    public WrapperPlayServerWindowItems(PacketContainer packet) {
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

    public List<ItemStack> getItems() {
        return this.handle.getLists(BukkitConverters.getItemStackConverter()).read(0);
    }

    public void setItems(List<ItemStack> value) {
        this.handle.getLists(BukkitConverters.getItemStackConverter()).write(0, value);
    }

    public ItemStack getCarriedItem() {
        return this.handle.getItemModifier().read(0);
    }

    public void setCarriedItem(ItemStack value) {
        this.handle.getItemModifier().write(0, value);
    }


}
