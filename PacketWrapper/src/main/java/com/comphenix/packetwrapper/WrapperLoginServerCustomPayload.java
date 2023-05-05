package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperLoginServerCustomPayload extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Login.Client.CUSTOM_PAYLOAD;

    public WrapperLoginServerCustomPayload() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperLoginServerCustomPayload(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getTransactionId() {
        return this.handle.getIntegers().read(0);
    }

    public void setTransactionId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public MinecraftKey getIdentifier() {
        return this.handle.getMinecraftKeys().read(0);
    }

    public void setIdentifier(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }

    public Object getData() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.network.FriendlyByteBuf
    }

    public void setData(Object value) {
        throw new UnsupportedOperationException();
    }


}
