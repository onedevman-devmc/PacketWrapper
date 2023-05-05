package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers.NativeGameMode;
import org.bukkit.World;

import javax.annotation.Nullable;
import java.util.Optional;

public class WrapperPlayServerRespawn extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.RESPAWN;

    public WrapperPlayServerRespawn() {
        super(TYPE);
    }

    public WrapperPlayServerRespawn(PacketContainer packet) {
        super(packet, TYPE);
    }

    public World getDimensionType() {
        return this.handle.getWorldKeys().read(0);
    }

    public void setDimensionType(World value) {
        this.handle.getWorldKeys().write(0, value);
    }

    public World getDimension() {
        return this.handle.getWorldKeys().read(1);
    }

    public void setDimension(World value) {
        this.handle.getWorldKeys().write(1, value);
    }

    public long getSeed() {
        return this.handle.getLongs().read(0);
    }

    public void setSeed(long value) {
        this.handle.getLongs().write(0, value);
    }

    public NativeGameMode getPlayerGameType() {
        return this.handle.getGameModes().read(0);
    }

    public void setPlayerGameType(NativeGameMode value) {
        this.handle.getGameModes().write(0, value);
    }

    public NativeGameMode getPreviousPlayerGameType() {
        return this.handle.getGameModes().read(1);
    }

    public void setPreviousPlayerGameType(NativeGameMode value) {
        this.handle.getGameModes().write(1, value);
    }

    public boolean getIsDebug() {
        return this.handle.getBooleans().read(0);
    }

    public void setIsDebug(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public boolean getIsFlat() {
        return this.handle.getBooleans().read(1);
    }

    public void setIsFlat(boolean value) {
        this.handle.getBooleans().write(1, value);
    }

    public byte getDataToKeep() {
        return this.handle.getBytes().read(0);
    }

    public void setDataToKeep(byte value) {
        this.handle.getBytes().write(0, value);
    }

    public Optional<BlockPosition> getLastDeathLocation() {
        return this.handle.getOptionals(BlockPosition.getConverter()).read(0);
    }

    public void setLastDeathLocation(@Nullable BlockPosition value) {
        this.handle.getOptionals(BlockPosition.getConverter()).write(0, Optional.ofNullable(value));
    }


}
