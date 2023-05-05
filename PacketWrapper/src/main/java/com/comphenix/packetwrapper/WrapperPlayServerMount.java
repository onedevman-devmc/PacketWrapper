package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerMount extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.MOUNT;

    public WrapperPlayServerMount() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerMount(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getVehicle() {
        return this.handle.getIntegers().read(0);
    }

    public void setVehicle(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int[] getPassengers() {
        return this.handle.getIntegerArrays().read(0);
    }

    public void setPassengers(int[] value) {
        this.handle.getIntegerArrays().write(0, value);
    }


}
