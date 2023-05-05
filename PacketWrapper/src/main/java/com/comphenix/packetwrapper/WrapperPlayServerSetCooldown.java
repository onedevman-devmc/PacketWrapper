package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.Material;

public class WrapperPlayServerSetCooldown extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_COOLDOWN;

    public WrapperPlayServerSetCooldown() {
        super(TYPE);
    }

    public WrapperPlayServerSetCooldown(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Material getItem() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.item.Item
    }

    public void setItem(Object value) {
        throw new UnsupportedOperationException();
    }

    public int getDuration() {
        return this.handle.getIntegers().read(0);
    }

    public void setDuration(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
