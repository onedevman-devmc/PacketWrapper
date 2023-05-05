package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.nbt.NbtBase;

public class WrapperPlayServerTileEntityData extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.TILE_ENTITY_DATA;

    public WrapperPlayServerTileEntityData() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerTileEntityData(PacketContainer packet) {
        super(packet, TYPE);
    }

    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    public Object getType() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.level.block.entity.BlockEntityType
    }

    public void setType(Object value) {
        throw new UnsupportedOperationException();
    }

    public NbtBase<?> getTag() {
        return this.handle.getNbtModifier().read(0);
    }

    public void setTag(NbtBase<?> value) {
        this.handle.getNbtModifier().write(0, value);
    }


}
