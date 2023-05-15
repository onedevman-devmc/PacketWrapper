package com.comphenix.packetwrapper.wrappers.login.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.packetwrapper.wrappers.login.clientbound.WrapperLoginServerCustomPayload;
import com.comphenix.protocol.wrappers.MinecraftKey;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 12.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperLoginServerCustomPayloadTest {
    public static final MinecraftKey DUMMY_KEY = new MinecraftKey("minecraft", "test");

    @Test
    public void test() {
        WrapperLoginServerCustomPayload dummy = new WrapperLoginServerCustomPayload();
        dummy.setData(Unpooled.buffer());
        dummy.setTransactionId(1);
        dummy.setIdentifier(DUMMY_KEY);
        assertNotNull(dummy.getData());
        assertEquals(1, dummy.getTransactionId());
        assertEquals(DUMMY_KEY, dummy.getIdentifier());
    }
}