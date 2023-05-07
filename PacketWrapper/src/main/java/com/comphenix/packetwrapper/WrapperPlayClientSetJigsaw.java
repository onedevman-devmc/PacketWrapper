package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayClientSetJigsaw extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.SET_JIGSAW;

    public WrapperPlayClientSetJigsaw() {
        super(TYPE);
    }

    public WrapperPlayClientSetJigsaw(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'pos'
     *
     * @return 'pos'
     */
    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    /**
     * Sets the value of field 'pos'
     *
     * @param value New value for field 'pos'
     */
    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    /**
     * Retrieves the value of field 'name'
     *
     * @return 'name'
     */
    public MinecraftKey getName() {
        return this.handle.getMinecraftKeys().read(0);
    }

    /**
     * Sets the value of field 'name'
     *
     * @param value New value for field 'name'
     */
    public void setName(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }

    /**
     * Retrieves the value of field 'target'
     *
     * @return 'target'
     */
    public MinecraftKey getTarget() {
        return this.handle.getMinecraftKeys().read(1);
    }

    /**
     * Sets the value of field 'target'
     *
     * @param value New value for field 'target'
     */
    public void setTarget(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(1, value);
    }

    /**
     * Retrieves the value of field 'pool'
     *
     * @return 'pool'
     */
    public MinecraftKey getPool() {
        return this.handle.getMinecraftKeys().read(2);
    }

    /**
     * Sets the value of field 'pool'
     *
     * @param value New value for field 'pool'
     */
    public void setPool(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(2, value);
    }

    /**
     * Retrieves the value of field 'finalState'
     *
     * @return 'finalState'
     */
    public String getFinalState() {
        return this.handle.getStrings().read(0);
    }

    /**
     * Sets the value of field 'finalState'
     *
     * @param value New value for field 'finalState'
     */
    public void setFinalState(String value) {
        this.handle.getStrings().write(0, value);
    }

    /**
     * Retrieves the value of field 'joint'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'joint'
     */
    public EnumWrappers.JointType getJoint() {
        return this.handle.getJointTypes().read(0);
    }

    /**
     * Sets the value of field 'joint'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'joint'
     */
    public void setJoint(EnumWrappers.JointType value) {
        this.handle.getJointTypes().write(0, value);
    }

}
