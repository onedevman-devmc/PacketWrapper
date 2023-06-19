package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.protocol.wrappers.nbt.NbtCompound;
import com.comphenix.protocol.wrappers.nbt.NbtFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 19.06.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerTileEntityDataTest {
    @Test
    public void test() {
        WrapperPlayServerTileEntityData dummy = new WrapperPlayServerTileEntityData();

        NbtCompound nbt = NbtFactory.ofCompound("A");
        nbt.setName("A");
        nbt.setValue(Collections.singletonMap("b", NbtFactory.of("c", 10)));
        dummy.setTag(nbt);

        NbtCompound restored = dummy.getTag();
        assertEquals(10, restored.getValue("c").getValue());
        assertNull(restored.getValue("d"));
    }
}