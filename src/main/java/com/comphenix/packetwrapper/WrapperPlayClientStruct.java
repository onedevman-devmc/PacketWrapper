package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.Vector3I;

public class WrapperPlayClientStruct extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.STRUCT;

    public WrapperPlayClientStruct() {
        super(TYPE);
    }

    public WrapperPlayClientStruct(PacketContainer packet) {
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
     * Retrieves the value of field 'updateType'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'updateType'
     */
    public EnumWrappers.StructureBlockUpdateType getUpdateType() {
        return this.handle.getStructureBlockUpdateTypes().read(0);
    }

    /**
     * Sets the value of field 'updateType'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'updateType'
     */
    public void setUpdateType(EnumWrappers.StructureBlockUpdateType value) {
        this.handle.getStructureBlockUpdateTypes().write(0, value);
    }

    /**
     * Retrieves the value of field 'mode'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'mode'
     */
    public EnumWrappers.StructureMode getMode() {
        return this.handle.getStructureModes().read(0);
    }

    /**
     * Sets the value of field 'mode'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'mode'
     */
    public void setMode(EnumWrappers.StructureMode value) {
        this.handle.getStructureModes().write(0, value);
    }

    /**
     * Retrieves the value of field 'name'
     *
     * @return 'name'
     */
    public String getName() {
        return this.handle.getStrings().read(0);
    }

    /**
     * Sets the value of field 'name'
     *
     * @param value New value for field 'name'
     */
    public void setName(String value) {
        this.handle.getStrings().write(0, value);
    }

    /**
     * Retrieves the value of field 'offset'
     *
     * @return 'offset'
     */
    public BlockPosition getOffset() {
        return this.handle.getBlockPositionModifier().read(1);
    }

    /**
     * Sets the value of field 'offset'
     *
     * @param value New value for field 'offset'
     */
    public void setOffset(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(1, value);
    }

    /**
     * Retrieves the value of field 'size'
     *
     * @return 'size'
     */
    public Vector3I getSize() {
        return this.handle.getVector3Is().read(0);
    }

    /**
     * Sets the value of field 'size'
     *
     * @param value New value for field 'size'
     */
    public void setSize(Vector3I value) {
        this.handle.getVector3Is().write(0, value);
    }

    /**
     * Retrieves the value of field 'mirror'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'mirror'
     */
    public InternalStructure getMirror() {
        return this.handle.getStructures().read(6); // TODO: No specific modifier has been found for type class net.minecraft.world.level.block.Mirror Generic type: class net.minecraft.world.level.block.Mirror
    }

    /**
     * Sets the value of field 'mirror'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'mirror'
     */
    public void setMirror(InternalStructure value) {
        this.handle.getStructures().write(6, value); // TODO: No specific modifier has been found for type class net.minecraft.world.level.block.Mirror Generic type: class net.minecraft.world.level.block.Mirror
    }

    /**
     * Retrieves the value of field 'rotation'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'rotation'
     */
    public InternalStructure getRotation() {
        return this.handle.getStructures().read(7); // TODO: No specific modifier has been found for type class net.minecraft.world.level.block.Rotation Generic type: class net.minecraft.world.level.block.Rotation
    }

    /**
     * Sets the value of field 'rotation'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'rotation'
     */
    public void setRotation(InternalStructure value) {
        this.handle.getStructures().write(7, value); // TODO: No specific modifier has been found for type class net.minecraft.world.level.block.Rotation Generic type: class net.minecraft.world.level.block.Rotation
    }

    /**
     * Retrieves the value of field 'data'
     *
     * @return 'data'
     */
    public String getData() {
        return this.handle.getStrings().read(1);
    }

    /**
     * Sets the value of field 'data'
     *
     * @param value New value for field 'data'
     */
    public void setData(String value) {
        this.handle.getStrings().write(1, value);
    }

    /**
     * Retrieves the value of field 'ignoreEntities'
     *
     * @return 'ignoreEntities'
     */
    public boolean getIgnoreEntities() {
        return this.handle.getBooleans().read(0);
    }

    /**
     * Sets the value of field 'ignoreEntities'
     *
     * @param value New value for field 'ignoreEntities'
     */
    public void setIgnoreEntities(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    /**
     * Retrieves the value of field 'showAir'
     *
     * @return 'showAir'
     */
    public boolean getShowAir() {
        return this.handle.getBooleans().read(1);
    }

    /**
     * Sets the value of field 'showAir'
     *
     * @param value New value for field 'showAir'
     */
    public void setShowAir(boolean value) {
        this.handle.getBooleans().write(1, value);
    }

    /**
     * Retrieves the value of field 'showBoundingBox'
     *
     * @return 'showBoundingBox'
     */
    public boolean getShowBoundingBox() {
        return this.handle.getBooleans().read(2);
    }

    /**
     * Sets the value of field 'showBoundingBox'
     *
     * @param value New value for field 'showBoundingBox'
     */
    public void setShowBoundingBox(boolean value) {
        this.handle.getBooleans().write(2, value);
    }

    /**
     * Retrieves the value of field 'integrity'
     *
     * @return 'integrity'
     */
    public float getIntegrity() {
        return this.handle.getFloat().read(0);
    }

    /**
     * Sets the value of field 'integrity'
     *
     * @param value New value for field 'integrity'
     */
    public void setIntegrity(float value) {
        this.handle.getFloat().write(0, value);
    }

    /**
     * Retrieves the value of field 'seed'
     *
     * @return 'seed'
     */
    public long getSeed() {
        return this.handle.getLongs().read(0);
    }

    /**
     * Sets the value of field 'seed'
     *
     * @param value New value for field 'seed'
     */
    public void setSeed(long value) {
        this.handle.getLongs().write(0, value);
    }

}
