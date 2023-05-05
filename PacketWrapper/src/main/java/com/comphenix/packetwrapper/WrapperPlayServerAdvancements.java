package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;
import com.comphenix.protocol.wrappers.WrappedStatistic;

import java.util.List;
import java.util.Map;

public class WrapperPlayServerAdvancements extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ADVANCEMENTS;

    public WrapperPlayServerAdvancements() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerAdvancements(PacketContainer packet) {
        super(packet, TYPE);
    }

    public boolean getReset() {
        return this.handle.getBooleans().read(0);
    }

    public void setReset(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public Map<WrappedStatistic, Integer> getAdded() {
        return this.handle.getStatisticMaps().read(0);
    }

    public void setAdded(Map<WrappedStatistic, Integer> value) {
        this.handle.getStatisticMaps().write(0, value);
    }

    public List<MinecraftKey> getRemoved() {
        return this.handle.getLists(MinecraftKey.getConverter()).read(0);
    }

    public void setRemoved(List<MinecraftKey> value) {
        this.handle.getLists(MinecraftKey.getConverter()).write(0, value);
    }

    public Map<WrappedStatistic, Integer> getProgress() {
        return this.handle.getStatisticMaps().read(1);
    }

    public void setProgress(Map<WrappedStatistic, Integer> value) {
        this.handle.getStatisticMaps().write(1, value);
    }


}
