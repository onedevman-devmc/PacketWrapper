package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerPosition extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.POSITION;

    public WrapperPlayServerPosition() {
        super(TYPE);
    }

    public WrapperPlayServerPosition(PacketContainer packet) {
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

    public float getYRot() {
        return this.handle.getFloat().read(0);
    }

    public void setYRot(float value) {
        this.handle.getFloat().write(0, value);
    }

    public float getXRot() {
        return this.handle.getFloat().read(1);
    }

    public void setXRot(float value) {
        this.handle.getFloat().write(1, value);
    }

    public Object getRelativeArguments() {
        // TODO: Multiple candidates found for raw type + interface java.util.Set here:
        // Generic field type: [class net.minecraft.world.entity.RelativeMovement]
        throw new UnsupportedOperationException();
    }

    public void setRelativeArguments(Object value) {
        throw new UnsupportedOperationException();
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
