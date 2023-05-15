package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerTileEntityData extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.TILE_ENTITY_DATA;

    public WrapperPlayServerTileEntityData() {
        super(TYPE);
    }

    public WrapperPlayServerTileEntityData(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'pos'
     *
     * @return 'pos'
     */
    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    /**
     * Sets the value of field 'pos'
     *
     * @param value New value for field 'pos'
     */
    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    /**
     * Retrieves the value of field 'type'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'type'
     */
    public InternalStructure getTypeInternal() {
        return this.handle.getStructures().read(1); // TODO: No specific modifier has been found for type class net.minecraft.world.level.block.entity.BlockEntityType Generic type: [?]
    }

    /**
     * Sets the value of field 'type'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'type'
     */
    public void setTypeInternal(InternalStructure value) {
        this.handle.getStructures().write(1, value); // TODO: No specific modifier has been found for type class net.minecraft.world.level.block.entity.BlockEntityType Generic type: [?]
    }

    /**
     * Retrieves the value of field 'tag'
     *
     * @return 'tag'
     */
    public WrappedChatComponent[] getTag() {
        return this.handle.getChatComponentArrays().read(0);
    }

    /**
     * Sets the value of field 'tag'
     *
     * @param value New value for field 'tag'
     */
    public void setTag(WrappedChatComponent[] value) {
        this.handle.getChatComponentArrays().write(0, value);
    }

}
