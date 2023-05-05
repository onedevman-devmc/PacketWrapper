package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayClientStruct extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.STRUCT;

    public WrapperPlayClientStruct() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientStruct(PacketContainer packet) {
        super(packet, TYPE);
    }

    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    public Object getUpdateType() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.level.block.entity.StructureBlockEntity$UpdateType
    }

    public void setUpdateType(Object value) {
        throw new UnsupportedOperationException();
    }

    public Object getMode() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.level.block.state.properties.StructureMode
    }

    public void setMode(Object value) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return this.handle.getStrings().read(0);
    }

    public void setName(String value) {
        this.handle.getStrings().write(0, value);
    }

    public BlockPosition getOffset() {
        return this.handle.getBlockPositionModifier().read(1);
    }

    public void setOffset(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(1, value);
    }

    public Object getSize() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.core.Vec3i
    }

    public void setSize(Object value) {
        throw new UnsupportedOperationException();
    }

    public Object getMirror() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.level.block.Mirror
    }

    public void setMirror(Object value) {
        throw new UnsupportedOperationException();
    }

    public Object getRotation() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.level.block.Rotation
    }

    public void setRotation(Object value) {
        throw new UnsupportedOperationException();
    }

    public String getData() {
        return this.handle.getStrings().read(1);
    }

    public void setData(String value) {
        this.handle.getStrings().write(1, value);
    }

    public boolean getIgnoreEntities() {
        return this.handle.getBooleans().read(0);
    }

    public void setIgnoreEntities(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public boolean getShowAir() {
        return this.handle.getBooleans().read(1);
    }

    public void setShowAir(boolean value) {
        this.handle.getBooleans().write(1, value);
    }

    public boolean getShowBoundingBox() {
        return this.handle.getBooleans().read(2);
    }

    public void setShowBoundingBox(boolean value) {
        this.handle.getBooleans().write(2, value);
    }

    public float getIntegrity() {
        return this.handle.getFloat().read(0);
    }

    public void setIntegrity(float value) {
        this.handle.getFloat().write(0, value);
    }

    public long getSeed() {
        return this.handle.getLongs().read(0);
    }

    public void setSeed(long value) {
        this.handle.getLongs().write(0, value);
    }


}
