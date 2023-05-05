package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerAction;

public class WrapperPlayClientEntityAction extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.ENTITY_ACTION;

    public WrapperPlayClientEntityAction() {
        super(TYPE);
    }

    public WrapperPlayClientEntityAction(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public PlayerAction getAction() {
        return this.handle.getPlayerActions().read(0);
    }

    public void setAction(PlayerAction value) {
        this.handle.getPlayerActions().write(0, value);
    }

    public int getData() {
        return this.handle.getIntegers().read(1);
    }

    public void setData(int value) {
        this.handle.getIntegers().write(1, value);
    }


}
