package com.comphenix.packetwrapper.wrappers.login.serverbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.packetwrapper.wrappers.login.serverbound.WrapperLoginClientCustomPayload;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Lukas Alt
 * @since 08.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperLoginClientCustomPayloadTest {
    @Test
    public void test() {
        WrapperLoginClientCustomPayload dummy = new WrapperLoginClientCustomPayload();
        dummy.setData(Unpooled.buffer());
        dummy.setTransactionId(1);
        assertNotNull(dummy.getData());
        assertEquals(1, dummy.getTransactionId());
    }

}