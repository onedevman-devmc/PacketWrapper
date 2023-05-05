package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperLoginServerEncryptionBegin extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Login.Server.ENCRYPTION_BEGIN;

    public WrapperLoginServerEncryptionBegin() {
        super(TYPE);
    }

    public WrapperLoginServerEncryptionBegin(PacketContainer packet) {
        super(packet, TYPE);
    }

    public String getServerId() {
        return this.handle.getStrings().read(0);
    }

    public void setServerId(String value) {
        this.handle.getStrings().write(0, value);
    }

    public byte[] getPublicKey() {
        return this.handle.getByteArrays().read(0);
    }

    public void setPublicKey(byte[] value) {
        this.handle.getByteArrays().write(0, value);
    }

    public byte[] getChallenge() {
        return this.handle.getByteArrays().read(1);
    }

    public void setChallenge(byte[] value) {
        this.handle.getByteArrays().write(1, value);
    }


}
