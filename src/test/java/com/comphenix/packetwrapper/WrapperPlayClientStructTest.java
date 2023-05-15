package com.comphenix.packetwrapper;

import com.comphenix.packetwrapper.wrappers.play.serverbound.WrapperPlayClientStruct;
import org.bukkit.block.structure.UsageMode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 12.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayClientStructTest {
    @Test
    public void test() {
        WrapperPlayClientStruct dummy = new WrapperPlayClientStruct();
        dummy.setMode(UsageMode.CORNER);
        dummy.setUpdateType(WrapperPlayClientStruct.UpdateType.UPDATE_DATA);
        assertEquals(UsageMode.CORNER, dummy.getMode());
        assertEquals(WrapperPlayClientStruct.UpdateType.UPDATE_DATA, dummy.getUpdateType());
    }
}