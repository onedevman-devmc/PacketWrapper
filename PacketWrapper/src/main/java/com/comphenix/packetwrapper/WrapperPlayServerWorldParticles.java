package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedParticle;

public class WrapperPlayServerWorldParticles extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.WORLD_PARTICLES;

    public WrapperPlayServerWorldParticles() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerWorldParticles(PacketContainer packet) {
        super(packet, TYPE);
    }

    public double getX() {
        return this.handle.getDoubles().read(0);
    }

    public void setX(double value) {
        this.handle.getDoubles().write(0, value);
    }

    public double getY() {
        return this.handle.getDoubles().read(1);
    }

    public void setY(double value) {
        this.handle.getDoubles().write(1, value);
    }

    public double getZ() {
        return this.handle.getDoubles().read(2);
    }

    public void setZ(double value) {
        this.handle.getDoubles().write(2, value);
    }

    public float getXDist() {
        return this.handle.getFloat().read(0);
    }

    public void setXDist(float value) {
        this.handle.getFloat().write(0, value);
    }

    public float getYDist() {
        return this.handle.getFloat().read(1);
    }

    public void setYDist(float value) {
        this.handle.getFloat().write(1, value);
    }

    public float getZDist() {
        return this.handle.getFloat().read(2);
    }

    public void setZDist(float value) {
        this.handle.getFloat().write(2, value);
    }

    public float getMaxSpeed() {
        return this.handle.getFloat().read(3);
    }

    public void setMaxSpeed(float value) {
        this.handle.getFloat().write(3, value);
    }

    public int getCount() {
        return this.handle.getIntegers().read(0);
    }

    public void setCount(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public boolean getOverrideLimiter() {
        return this.handle.getBooleans().read(0);
    }

    public void setOverrideLimiter(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public WrappedParticle getParticle() {
        return this.handle.getNewParticles().read(0);
    }

    public void setParticle(WrappedParticle value) {
        this.handle.getNewParticles().write(0, value);
    }


}
