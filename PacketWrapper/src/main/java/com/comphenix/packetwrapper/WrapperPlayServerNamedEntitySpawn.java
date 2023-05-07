package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

import java.util.UUID;

public class WrapperPlayServerNamedEntitySpawn extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.NAMED_ENTITY_SPAWN;

    public WrapperPlayServerNamedEntitySpawn() {
        super(TYPE);
    }

    public WrapperPlayServerNamedEntitySpawn(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'entityId'
     *
     * @return 'entityId'
     */
    public int getEntityId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'entityId'
     *
     * @param value New value for field 'entityId'
     */
    public void setEntityId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'playerId'
     *
     * @return 'playerId'
     */
    public UUID getPlayerId() {
        return this.handle.getUUIDs().read(0);
    }

    /**
     * Sets the value of field 'playerId'
     *
     * @param value New value for field 'playerId'
     */
    public void setPlayerId(UUID value) {
        this.handle.getUUIDs().write(0, value);
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
    public byte getYRot() {
        return this.handle.getBytes().read(0);
    }

    /**
     * Sets the value of field 'yRot'
     *
     * @param value New value for field 'yRot'
     */
    public void setYRot(byte value) {
        this.handle.getBytes().write(0, value);
    }

    /**
     * Retrieves the value of field 'xRot'
     *
     * @return 'xRot'
     */
    public byte getXRot() {
        return this.handle.getBytes().read(1);
    }

    /**
     * Sets the value of field 'xRot'
     *
     * @param value New value for field 'xRot'
     */
    public void setXRot(byte value) {
        this.handle.getBytes().write(1, value);
    }

}
