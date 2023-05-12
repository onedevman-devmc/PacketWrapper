package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
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

    /**
     * Retrieves the value of field 'id'
     *
     * @return 'id'
     */
    public UUID getId() {
        return this.handle.getUUIDs().read(0);
    }

    /**
     * Sets the value of field 'id'
     *
     * @param value New value for field 'id'
     */
    public void setId(UUID value) {
        this.handle.getUUIDs().write(0, value);
    }

    /**
     * Retrieves the value of field 'operation'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'operation'
     */
    public InternalStructure getOperationInternal() {
        return this.handle.getStructures().read(1); // TODO: No specific modifier has been found for type interface net.minecraft.network.protocol.game.ClientboundBossEventPacket$Operation Generic type: interface net.minecraft.network.protocol.game.ClientboundBossEventPacket$Operation
    }

    /**
     * Sets the value of field 'operation'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'operation'
     */
    public void setOperationInternal(InternalStructure value) {
        this.handle.getStructures().write(1, value); // TODO: No specific modifier has been found for type interface net.minecraft.network.protocol.game.ClientboundBossEventPacket$Operation Generic type: interface net.minecraft.network.protocol.game.ClientboundBossEventPacket$Operation
    }

}
