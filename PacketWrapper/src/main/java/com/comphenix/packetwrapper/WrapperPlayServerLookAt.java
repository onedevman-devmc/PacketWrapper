package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerLookAt extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.LOOK_AT;

    public WrapperPlayServerLookAt() {
        super(TYPE);
    }

    public WrapperPlayServerLookAt(PacketContainer packet) {
        super(packet, TYPE);
    }

    public double getX() {
        return this.handle.getDoubles().read(0);
    }

    public void setX(double value) {
        this.handle.getDoubles().write(0, value);
    }

    public double getY() {
        return this.handle.getDoubles().read(1);
    }

    public void setY(double value) {
        this.handle.getDoubles().write(1, value);
    }

    public double getZ() {
        return this.handle.getDoubles().read(2);
    }

    public void setZ(double value) {
        this.handle.getDoubles().write(2, value);
    }

    public int getEntity() {
        return this.handle.getIntegers().read(0);
    }

    public void setEntity(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public Object getFromAnchor() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
    }

    public void setFromAnchor(Object value) {
        throw new UnsupportedOperationException();
    }

    public Object getToAnchor() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
    }

    public void setToAnchor(Object value) {
        throw new UnsupportedOperationException();
    }

    public boolean getAtEntity() {
        return this.handle.getBooleans().read(0);
    }

    public void setAtEntity(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
