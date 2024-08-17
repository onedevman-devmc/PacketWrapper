package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.Converters;
import it.unimi.dsi.fastutil.ints.IntList;

public class WrapperPlayServerEntityDestroy extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_DESTROY;

    public WrapperPlayServerEntityDestroy() {
        super(TYPE);
    }

    public WrapperPlayServerEntityDestroy(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'entityIds'
     *
     * @return 'entityIds'
     */
    public IntList getEntityIds() {
        return this.handle.getModifier().withType(IntList.class, Converters.passthrough(IntList.class)).read(0);
    }

    /**
     * Sets the value of field 'entityIds'
     *
     * @param value New value for field 'entityIds'
     */
    public void setEntityIds(IntList value) {
        this.handle.getModifier().withType(IntList.class, Converters.passthrough(IntList.class)).write(0, value);
    }

}
