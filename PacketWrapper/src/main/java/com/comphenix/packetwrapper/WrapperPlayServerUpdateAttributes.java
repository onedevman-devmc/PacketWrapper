package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerUpdateAttributes extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.UPDATE_ATTRIBUTES;

    public WrapperPlayServerUpdateAttributes() {
        super(TYPE);
    }

    public WrapperPlayServerUpdateAttributes(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getEntityId() {
        return this.handle.getIntegers().read(0);
    }

    public void setEntityId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public Object getAttributes() {
        // TODO: Multiple candidates found for raw type + interface java.util.List here:
        // Generic field type: [class net.minecraft.network.protocol.game.ClientboundUpdateAttributesPacket$AttributeSnapshot]//    return this.handle.getSlotStackPairLists().read(-1);
        throw new UnsupportedOperationException();
    }

    public void setAttributes(Object value) {
        throw new UnsupportedOperationException();
    }


}
