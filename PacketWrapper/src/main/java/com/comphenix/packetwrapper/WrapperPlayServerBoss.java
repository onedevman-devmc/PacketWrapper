package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

import java.util.UUID;

public class WrapperPlayServerBoss extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.BOSS;

    public WrapperPlayServerBoss() {
        super(TYPE);
    }

    public WrapperPlayServerBoss(PacketContainer packet) {
        super(packet, TYPE);
    }

    public UUID getId() {
        return this.handle.getUUIDs().read(0);
    }

    public void setId(UUID value) {
        this.handle.getUUIDs().write(0, value);
    }

    public Object getOperation() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type interface net.minecraft.network.protocol.game.ClientboundBossEventPacket$Operation
    }

    public void setOperation(Object value) {
        throw new UnsupportedOperationException();
    }


}
