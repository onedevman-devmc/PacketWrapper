package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

import javax.annotation.Nullable;
import java.util.Optional;

public class WrapperPlayServerDamageEvent extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.DAMAGE_EVENT;

    public WrapperPlayServerDamageEvent() {
        super(TYPE);
    }

    public WrapperPlayServerDamageEvent(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getEntityId() {
        return this.handle.getIntegers().read(0);
    }

    public void setEntityId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getSourceTypeId() {
        return this.handle.getIntegers().read(1);
    }

    public void setSourceTypeId(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public int getSourceCauseId() {
        return this.handle.getIntegers().read(2);
    }

    public void setSourceCauseId(int value) {
        this.handle.getIntegers().write(2, value);
    }

    public int getSourceDirectId() {
        return this.handle.getIntegers().read(3);
    }

    public void setSourceDirectId(int value) {
        this.handle.getIntegers().write(3, value);
    }

    public Optional<BlockPosition> getSourcePosition() {
        return this.handle.getOptionals(BlockPosition.getConverter()).read(0);
    }

    public void setSourcePosition(@Nullable BlockPosition value) {
        this.handle.getOptionals(BlockPosition.getConverter()).write(0, Optional.ofNullable(value));
    }


}
