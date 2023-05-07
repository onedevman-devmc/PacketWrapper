package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;

import java.util.Set;

public class WrapperPlayServerPosition extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.POSITION;

    public WrapperPlayServerPosition() {
        super(TYPE);
    }

    public WrapperPlayServerPosition(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'x'
     *
     * @return 'x'
     */
    public double getX() {
        return this.handle.getDoubles().read(0);
    }

    /**
     * Sets the value of field 'x'
     *
     * @param value New value for field 'x'
     */
    public void setX(double value) {
        this.handle.getDoubles().write(0, value);
    }

    /**
     * Retrieves the value of field 'y'
     *
     * @return 'y'
     */
    public double getY() {
        return this.handle.getDoubles().read(1);
    }

    /**
     * Sets the value of field 'y'
     *
     * @param value New value for field 'y'
     */
    public void setY(double value) {
        this.handle.getDoubles().write(1, value);
    }

    /**
     * Retrieves the value of field 'z'
     *
     * @return 'z'
     */
    public double getZ() {
        return this.handle.getDoubles().read(2);
    }

    /**
     * Sets the value of field 'z'
     *
     * @param value New value for field 'z'
     */
    public void setZ(double value) {
        this.handle.getDoubles().write(2, value);
    }

    /**
     * Retrieves the value of field 'yRot'
     *
     * @return 'yRot'
     */
    public float getYRot() {
        return this.handle.getFloat().read(0);
    }

    /**
     * Sets the value of field 'yRot'
     *
     * @param value New value for field 'yRot'
     */
    public void setYRot(float value) {
        this.handle.getFloat().write(0, value);
    }

    /**
     * Retrieves the value of field 'xRot'
     *
     * @return 'xRot'
     */
    public float getXRot() {
        return this.handle.getFloat().read(1);
    }

    /**
     * Sets the value of field 'xRot'
     *
     * @param value New value for field 'xRot'
     */
    public void setXRot(float value) {
        this.handle.getFloat().write(1, value);
    }

    /**
     * Retrieves the value of field 'relativeArguments'
     *
     * @return 'relativeArguments'
     */
    public Set<InternalStructure> getRelativeArguments() {
        return this.handle.getSets(InternalStructure.getConverter()).read(0); // TODO: No converter available for class net.minecraft.world.entity.RelativeMovement
    }

    /**
     * Sets the value of field 'relativeArguments'
     *
     * @param value New value for field 'relativeArguments'
     */
    public void setRelativeArguments(Set<InternalStructure> value) {
        this.handle.getSets(InternalStructure.getConverter()).write(0, value);  // TODO: No converter available for class net.minecraft.world.entity.RelativeMovement
    }

    /**
     * Retrieves the value of field 'id'
     *
     * @return 'id'
     */
    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'id'
     *
     * @param value New value for field 'id'
     */
    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

}
