package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerOpenWindow extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.OPEN_WINDOW;

    public WrapperPlayServerOpenWindow() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerOpenWindow(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public Object getType() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.inventory.MenuType
    }

    public void setType(Object value) {
        throw new UnsupportedOperationException();
    }

    public WrappedChatComponent getTitle() {
        return this.handle.getChatComponents().read(0);
    }

    public void setTitle(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }


}
