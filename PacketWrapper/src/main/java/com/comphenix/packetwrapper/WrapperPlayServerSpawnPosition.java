package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerSpawnPosition extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SPAWN_POSITION;

    public WrapperPlayServerSpawnPosition() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerSpawnPosition(PacketContainer packet) {
        super(packet, TYPE);
    }

public BlockPosition getPos() {
    return this.handle.getBlockPositionModifier().read(0);
}

public void setPos(BlockPosition value) {
    this.handle.getBlockPositionModifier().write(0, value);
}

public float getAngle() {
    return this.handle.getFloat().read(0);
}

public void setAngle(float value) {
    this.handle.getFloat().write(0, value);
}


}
