package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerLookAt extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.LOOK_AT;

    public WrapperPlayServerLookAt() {
        super(TYPE);
    }

    public WrapperPlayServerLookAt(PacketContainer packet) {
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
     * Retrieves the value of field 'entity'
     *
     * @return 'entity'
     */
    public int getEntity() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'entity'
     *
     * @param value New value for field 'entity'
     */
    public void setEntity(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'fromAnchor'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'fromAnchor'
     */
    public InternalStructure getFromAnchor() {
        return this.handle.getStructures().read(0); // TODO: No specific modifier has been found for type class net.minecraft.commands.arguments.EntityAnchorArgument$Anchor Generic type: class net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
    }

    /**
     * Sets the value of field 'fromAnchor'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'fromAnchor'
     */
    public void setFromAnchor(InternalStructure value) {
        this.handle.getStructures().write(0, value); // TODO: No specific modifier has been found for type class net.minecraft.commands.arguments.EntityAnchorArgument$Anchor Generic type: class net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
    }

    /**
     * Retrieves the value of field 'toAnchor'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'toAnchor'
     */
    public InternalStructure getToAnchor() {
        return this.handle.getStructures().read(1); // TODO: No specific modifier has been found for type class net.minecraft.commands.arguments.EntityAnchorArgument$Anchor Generic type: class net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
    }

    /**
     * Sets the value of field 'toAnchor'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'toAnchor'
     */
    public void setToAnchor(InternalStructure value) {
        this.handle.getStructures().write(1, value); // TODO: No specific modifier has been found for type class net.minecraft.commands.arguments.EntityAnchorArgument$Anchor Generic type: class net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
    }

    /**
     * Retrieves the value of field 'atEntity'
     *
     * @return 'atEntity'
     */
    public boolean getAtEntity() {
        return this.handle.getBooleans().read(0);
    }

    /**
     * Sets the value of field 'atEntity'
     *
     * @param value New value for field 'atEntity'
     */
    public void setAtEntity(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

}
