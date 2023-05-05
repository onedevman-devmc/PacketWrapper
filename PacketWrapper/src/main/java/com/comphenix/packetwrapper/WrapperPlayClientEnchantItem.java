package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientEnchantItem extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.ENCHANT_ITEM;

    public WrapperPlayClientEnchantItem() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientEnchantItem(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getButtonId() {
        return this.handle.getIntegers().read(1);
    }

    public void setButtonId(int value) {
        this.handle.getIntegers().write(1, value);
    }


}
