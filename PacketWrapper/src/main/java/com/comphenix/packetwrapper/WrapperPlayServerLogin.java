package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.BukkitConverters;
import com.comphenix.protocol.wrappers.EnumWrappers.NativeGameMode;
import org.bukkit.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

public class WrapperPlayServerLogin extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.LOGIN;

    public WrapperPlayServerLogin() {
        super(TYPE);
    }

    public WrapperPlayServerLogin(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getPlayerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setPlayerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public boolean getHardcore() {
        return this.handle.getBooleans().read(0);
    }

    public void setHardcore(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public NativeGameMode getGameType() {
        return this.handle.getGameModes().read(0);
    }

    public void setGameType(NativeGameMode value) {
        this.handle.getGameModes().write(0, value);
    }

    public NativeGameMode getPreviousGameType() {
        return this.handle.getGameModes().read(1);
    }

    public void setPreviousGameType(NativeGameMode value) {
        this.handle.getGameModes().write(1, value);
    }

    public List<World> getLevels() {
        return this.handle.getLists(BukkitConverters.getWorldKeyConverter()).read(0);
    }

    public void setLevels(List<World> value) {
        this.handle.getLists(BukkitConverters.getWorldKeyConverter()).write(0, value);

    }

    public Object getRegistryHolder() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type interface net.minecraft.core.RegistryAccess$Frozen
    }

    public void setRegistryHolder(Object value) {
        throw new UnsupportedOperationException();
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

    public int getMaxPlayers() {
        return this.handle.getIntegers().read(1);
    }

    public void setMaxPlayers(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public int getChunkRadius() {
        return this.handle.getIntegers().read(2);
    }

    public void setChunkRadius(int value) {
        this.handle.getIntegers().write(2, value);
    }

    public int getSimulationDistance() {
        return this.handle.getIntegers().read(3);
    }

    public void setSimulationDistance(int value) {
        this.handle.getIntegers().write(3, value);
    }

    public boolean getReducedDebugInfo() {
        return this.handle.getBooleans().read(1);
    }

    public void setReducedDebugInfo(boolean value) {
        this.handle.getBooleans().write(1, value);
    }

    public boolean getShowDeathScreen() {
        return this.handle.getBooleans().read(2);
    }

    public void setShowDeathScreen(boolean value) {
        this.handle.getBooleans().write(2, value);
    }

    public boolean getIsDebug() {
        return this.handle.getBooleans().read(3);
    }

    public void setIsDebug(boolean value) {
        this.handle.getBooleans().write(3, value);
    }

    public boolean getIsFlat() {
        return this.handle.getBooleans().read(4);
    }

    public void setIsFlat(boolean value) {
        this.handle.getBooleans().write(4, value);
    }

    public Optional<BlockPosition> getLastDeathLocation() {
        return this.handle.getOptionals(BlockPosition.getConverter()).read(0);
    }

    public void setLastDeathLocation(@Nullable BlockPosition value) {
        this.handle.getOptionals(BlockPosition.getConverter()).write(0, Optional.ofNullable(value));
    }


}
