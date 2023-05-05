package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerMap extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.MAP;

    public WrapperPlayServerMap() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerMap(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getMapId() {
        return this.handle.getIntegers().read(0);
    }

    public void setMapId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public byte getScale() {
        return this.handle.getBytes().read(0);
    }

    public void setScale(byte value) {
        this.handle.getBytes().write(0, value);
    }

    public boolean getLocked() {
        return this.handle.getBooleans().read(0);
    }

    public void setLocked(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public Object getDecorations() {
// Generic field type: [class net.minecraft.world.level.saveddata.maps.MapDecoration]//    return this.handle.getSlotStackPairLists().read(-1);
        throw new UnsupportedOperationException();
    }

    public void setDecorations(Object value) {
        throw new UnsupportedOperationException();
    }

    public Object getColorPatch() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.level.saveddata.maps.MapItemSavedData$MapPatch
    }

    public void setColorPatch(Object value) {
        throw new UnsupportedOperationException();
    }


}
