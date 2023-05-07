package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.NativeGameMode;
import com.comphenix.protocol.wrappers.Vector3I;
import org.bukkit.World;

import javax.annotation.Nullable;
import java.util.Optional;

public class WrapperPlayServerLogin extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.LOGIN;

    public WrapperPlayServerLogin() {
        super(TYPE);
    }

    public WrapperPlayServerLogin(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'playerId'
     *
     * @return 'playerId'
     */
    public int getPlayerId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'playerId'
     *
     * @param value New value for field 'playerId'
     */
    public void setPlayerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'hardcore'
     *
     * @return 'hardcore'
     */
    public boolean getHardcore() {
        return this.handle.getBooleans().read(0);
    }

    /**
     * Sets the value of field 'hardcore'
     *
     * @param value New value for field 'hardcore'
     */
    public void setHardcore(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    /**
     * Retrieves the value of field 'gameType'
     *
     * @return 'gameType'
     */
    public NativeGameMode getGameType() {
        return this.handle.getGameModes().read(0);
    }

    /**
     * Sets the value of field 'gameType'
     *
     * @param value New value for field 'gameType'
     */
    public void setGameType(NativeGameMode value) {
        this.handle.getGameModes().write(0, value);
    }

    /**
     * Retrieves the value of field 'previousGameType'
     *
     * @return 'previousGameType'
     */
    public NativeGameMode getPreviousGameType() {
        return this.handle.getGameModes().read(1);
    }

    /**
     * Sets the value of field 'previousGameType'
     *
     * @param value New value for field 'previousGameType'
     */
    public void setPreviousGameType(NativeGameMode value) {
        this.handle.getGameModes().write(1, value);
    }

    /**
     * Retrieves the value of field 'levels'
     *
     * @return 'levels'
     */
    public Iterable getLevels() {
        // TODO: Multiple modifier have been found for type interface java.util.Set Generic type: [net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level>]
        // java.util.List getWatchableCollectionModifier
        // java.util.List getBlockPositionCollectionModifier
        // java.util.List getDataValueCollectionModifier
        // java.util.List getAttributeCollectionModifier
        // java.util.List getPlayerInfoDataLists
        // java.util.List getListNbtModifier
        return this.handle.getPacketBundles().read(0);
    }

    /**
     * Sets the value of field 'levels'
     *
     * @param value New value for field 'levels'
     */
    public void setLevels(Iterable value) {
        this.handle.getPacketBundles().write(0, value);
    }

    /**
     * Retrieves the value of field 'registryHolder'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'registryHolder'
     */
    public InternalStructure getRegistryHolder() {
        return this.handle.getStructures().read(5); // TODO: No specific modifier has been found for type interface net.minecraft.core.RegistryAccess$Frozen Generic type: interface net.minecraft.core.RegistryAccess$Frozen
    }

    /**
     * Sets the value of field 'registryHolder'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'registryHolder'
     */
    public void setRegistryHolder(InternalStructure value) {
        this.handle.getStructures().write(5, value); // TODO: No specific modifier has been found for type interface net.minecraft.core.RegistryAccess$Frozen Generic type: interface net.minecraft.core.RegistryAccess$Frozen
    }

    /**
     * Retrieves the value of field 'dimensionType'
     *
     * @return 'dimensionType'
     */
    public World getDimensionType() {
        return this.handle.getWorldKeys().read(0);
    }

    /**
     * Sets the value of field 'dimensionType'
     *
     * @param value New value for field 'dimensionType'
     */
    public void setDimensionType(World value) {
        this.handle.getWorldKeys().write(0, value);
    }

    /**
     * Retrieves the value of field 'dimension'
     *
     * @return 'dimension'
     */
    public World getDimension() {
        return this.handle.getWorldKeys().read(1);
    }

    /**
     * Sets the value of field 'dimension'
     *
     * @param value New value for field 'dimension'
     */
    public void setDimension(World value) {
        this.handle.getWorldKeys().write(1, value);
    }

    /**
     * Retrieves the value of field 'seed'
     *
     * @return 'seed'
     */
    public long getSeed() {
        return this.handle.getLongs().read(0);
    }

    /**
     * Sets the value of field 'seed'
     *
     * @param value New value for field 'seed'
     */
    public void setSeed(long value) {
        this.handle.getLongs().write(0, value);
    }

    /**
     * Retrieves the value of field 'maxPlayers'
     *
     * @return 'maxPlayers'
     */
    public int getMaxPlayers() {
        return this.handle.getIntegers().read(1);
    }

    /**
     * Sets the value of field 'maxPlayers'
     *
     * @param value New value for field 'maxPlayers'
     */
    public void setMaxPlayers(int value) {
        this.handle.getIntegers().write(1, value);
    }

    /**
     * Retrieves the value of field 'chunkRadius'
     *
     * @return 'chunkRadius'
     */
    public int getChunkRadius() {
        return this.handle.getIntegers().read(2);
    }

    /**
     * Sets the value of field 'chunkRadius'
     *
     * @param value New value for field 'chunkRadius'
     */
    public void setChunkRadius(int value) {
        this.handle.getIntegers().write(2, value);
    }

    /**
     * Retrieves the value of field 'simulationDistance'
     *
     * @return 'simulationDistance'
     */
    public int getSimulationDistance() {
        return this.handle.getIntegers().read(3);
    }

    /**
     * Sets the value of field 'simulationDistance'
     *
     * @param value New value for field 'simulationDistance'
     */
    public void setSimulationDistance(int value) {
        this.handle.getIntegers().write(3, value);
    }

    /**
     * Retrieves the value of field 'reducedDebugInfo'
     *
     * @return 'reducedDebugInfo'
     */
    public boolean getReducedDebugInfo() {
        return this.handle.getBooleans().read(1);
    }

    /**
     * Sets the value of field 'reducedDebugInfo'
     *
     * @param value New value for field 'reducedDebugInfo'
     */
    public void setReducedDebugInfo(boolean value) {
        this.handle.getBooleans().write(1, value);
    }

    /**
     * Retrieves the value of field 'showDeathScreen'
     *
     * @return 'showDeathScreen'
     */
    public boolean getShowDeathScreen() {
        return this.handle.getBooleans().read(2);
    }

    /**
     * Sets the value of field 'showDeathScreen'
     *
     * @param value New value for field 'showDeathScreen'
     */
    public void setShowDeathScreen(boolean value) {
        this.handle.getBooleans().write(2, value);
    }

    /**
     * Retrieves the value of field 'isDebug'
     *
     * @return 'isDebug'
     */
    public boolean getIsDebug() {
        return this.handle.getBooleans().read(3);
    }

    /**
     * Sets the value of field 'isDebug'
     *
     * @param value New value for field 'isDebug'
     */
    public void setIsDebug(boolean value) {
        this.handle.getBooleans().write(3, value);
    }

    /**
     * Retrieves the value of field 'isFlat'
     *
     * @return 'isFlat'
     */
    public boolean getIsFlat() {
        return this.handle.getBooleans().read(4);
    }

    /**
     * Sets the value of field 'isFlat'
     *
     * @param value New value for field 'isFlat'
     */
    public void setIsFlat(boolean value) {
        this.handle.getBooleans().write(4, value);
    }

    /**
     * Retrieves the value of field 'lastDeathLocation'
     *
     * @return 'lastDeathLocation'
     */
    public Optional<Vector3I> getLastDeathLocation() {
        return this.handle.getOptionals(Vector3I.getConverter()).read(0);
    }

    /**
     * Sets the value of field 'lastDeathLocation'
     *
     * @param value New value for field 'lastDeathLocation'
     */
    public void setLastDeathLocation(@Nullable Vector3I value) {
        this.handle.getOptionals(Vector3I.getConverter()).write(0, Optional.ofNullable(value));
    }

}
