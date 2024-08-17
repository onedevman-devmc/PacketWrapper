package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.Converters;

import java.util.List;
import java.util.UUID;

public class WrapperPlayServerPlayerInfoRemove extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.PLAYER_INFO_REMOVE;

    public WrapperPlayServerPlayerInfoRemove() {
        super(TYPE);
    }

    public WrapperPlayServerPlayerInfoRemove(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'profileIds'
     *
     * @return 'profileIds'
     */
    public List<UUID> getProfileIds() {
        return this.handle.getLists(Converters.passthrough(UUID.class)).read(0);
    }

    /**
     * Sets the value of field 'profileIds'
     *
     * @param value New value for field 'profileIds'
     */
    public void setProfileIds(List<UUID> value) {
        this.handle.getLists(Converters.passthrough(UUID.class)).write(0, value);
    }

}
