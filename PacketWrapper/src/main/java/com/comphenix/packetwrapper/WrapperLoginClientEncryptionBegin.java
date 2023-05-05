package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperLoginClientEncryptionBegin extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Login.Client.ENCRYPTION_BEGIN;

    public WrapperLoginClientEncryptionBegin() {
        super(TYPE);
    }

    public WrapperLoginClientEncryptionBegin(PacketContainer packet) {
        super(packet, TYPE);
    }

    public byte[] getKeyBytes() {
        return this.handle.getByteArrays().read(0);
    }

    public void setKeyBytes(byte[] value) {
        this.handle.getByteArrays().write(0, value);
    }

    public byte[] getEncryptedChallenge() {
        return this.handle.getByteArrays().read(1);
    }

    public void setEncryptedChallenge(byte[] value) {
        this.handle.getByteArrays().write(1, value);
    }


}
