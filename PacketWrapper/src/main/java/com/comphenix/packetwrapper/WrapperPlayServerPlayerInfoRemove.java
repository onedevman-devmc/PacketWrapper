package com.comphenix.packetwrapper;

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

    public List<UUID> getProfileIds() {
        return this.handle.getLists(Converters.passthrough(UUID.class)).read(0);
    }

    public void setProfileIds(List<UUID> value) {
        this.handle.getLists(Converters.passthrough(UUID.class)).write(0, value);
    }


}
