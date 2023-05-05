package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayClientSetJigsaw extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.SET_JIGSAW;

    public WrapperPlayClientSetJigsaw() {
        super(TYPE);
    }

    public WrapperPlayClientSetJigsaw(PacketContainer packet) {
        super(packet, TYPE);
    }

    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    public MinecraftKey getName() {
        return this.handle.getMinecraftKeys().read(0);
    }

    public void setName(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }

    public MinecraftKey getTarget() {
        return this.handle.getMinecraftKeys().read(1);
    }

    public void setTarget(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(1, value);
    }

    public MinecraftKey getPool() {
        return this.handle.getMinecraftKeys().read(2);
    }

    public void setPool(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(2, value);
    }

    public String getFinalState() {
        return this.handle.getStrings().read(0);
    }

    public void setFinalState(String value) {
        this.handle.getStrings().write(0, value);
    }

    public Object getJoint() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.level.block.entity.JigsawBlockEntity$JointType
    }

    public void setJoint(Object value) {
        throw new UnsupportedOperationException();
    }


}
