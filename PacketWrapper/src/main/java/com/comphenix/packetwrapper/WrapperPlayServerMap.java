package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;

import java.util.List;

public class WrapperPlayServerMap extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.MAP;

    public WrapperPlayServerMap() {
        super(TYPE);
    }

    public WrapperPlayServerMap(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'mapId'
     *
     * @return 'mapId'
     */
    public int getMapId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'mapId'
     *
     * @param value New value for field 'mapId'
     */
    public void setMapId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'scale'
     *
     * @return 'scale'
     */
    public byte getScale() {
        return this.handle.getBytes().read(0);
    }

    /**
     * Sets the value of field 'scale'
     *
     * @param value New value for field 'scale'
     */
    public void setScale(byte value) {
        this.handle.getBytes().write(0, value);
    }

    /**
     * Retrieves the value of field 'locked'
     *
     * @return 'locked'
     */
    public boolean getLocked() {
        return this.handle.getBooleans().read(0);
    }

    /**
     * Sets the value of field 'locked'
     *
     * @param value New value for field 'locked'
     */
    public void setLocked(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    /**
     * Retrieves the value of field 'decorations'
     *
     * @return 'decorations'
     */
    public List<InternalStructure> getDecorations() {
        return this.handle.getLists(InternalStructure.getConverter()).read(0);
    }

    /**
     * Sets the value of field 'decorations'
     *
     * @param value New value for field 'decorations'
     */
    public void setDecorations(List<InternalStructure> value) {
        this.handle.getLists(InternalStructure.getConverter()).write(0, value);
    }

    /**
     * Retrieves the value of field 'colorPatch'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'colorPatch'
     */
    public InternalStructure getColorPatch() {
        return this.handle.getStructures().read(4); // TODO: No specific modifier has been found for type class net.minecraft.world.level.saveddata.maps.MapItemSavedData$MapPatch Generic type: class net.minecraft.world.level.saveddata.maps.MapItemSavedData$MapPatch
    }

    /**
     * Sets the value of field 'colorPatch'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'colorPatch'
     */
    public void setColorPatch(InternalStructure value) {
        this.handle.getStructures().write(4, value); // TODO: No specific modifier has been found for type class net.minecraft.world.level.saveddata.maps.MapItemSavedData$MapPatch Generic type: class net.minecraft.world.level.saveddata.maps.MapItemSavedData$MapPatch
    }

}
