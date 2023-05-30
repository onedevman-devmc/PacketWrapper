package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.util.ReflectiveAdventureComponentConverter;
import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.wrappers.ComponentConverter;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import net.md_5.bungee.api.chat.BaseComponent;

public class WrapperPlayServerSetActionBarText extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_ACTION_BAR_TEXT;

    /**
     * Constructs a new wrapper and initialize it with a packet handle with default values
     */
    public WrapperPlayServerSetActionBarText() {
        super(TYPE);
    }

    public WrapperPlayServerSetActionBarText(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Get the action bar component
     *
     * @return action bar components
     */
    public WrappedChatComponent getText() {
        WrappedChatComponent read = this.handle.getChatComponents().read(0);
        if(read != null) {
            return read;
        }
        Object adventure = this.handle.getStructures().read(1).getHandle();
        if(adventure != null) {
            return ReflectiveAdventureComponentConverter.fromComponent(adventure);
        }
        BaseComponent[] baseComponents = (BaseComponent[]) this.handle.getStructures().read(2).getHandle();
        return ComponentConverter.fromBaseComponent(baseComponents);
    }

    /**
     * Sets the action bar component
     *
     * @param value New action bar component
     */
    public void setText(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
        StructureModifier<InternalStructure> structures = this.handle.getStructures();
        if(structures.size() > 1) {
            for(int i = 1; i < structures.size(); i++) {
                structures.write(i, null);
            }
        }
    }

}
