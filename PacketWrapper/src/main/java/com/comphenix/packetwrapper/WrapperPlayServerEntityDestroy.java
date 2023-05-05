package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import it.unimi.dsi.fastutil.ints.IntList;

public class WrapperPlayServerEntityDestroy extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_DESTROY;

    public WrapperPlayServerEntityDestroy() {
        super(TYPE);
    }

    public WrapperPlayServerEntityDestroy(PacketContainer packet) {
        super(packet, TYPE);
    }

    public IntList getEntityIds() {
        return this.handle.getSpecificModifier(IntList.class).read(0);
    }

    public void setEntityIds(IntList value) {
        this.handle.getSpecificModifier(IntList.class).write(0, value);
    }

}
