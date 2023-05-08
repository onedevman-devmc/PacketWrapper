package com.comphenix.packetwrapper;

import com.comphenix.protocol.wrappers.WrappedPacketDataSerializer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 08.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperLoginClientCustomPayloadTest {
    @Test
    public void test() {
        WrapperLoginClientCustomPayload dummy = new WrapperLoginClientCustomPayload();
        dummy.setData(WrappedPacketDataSerializer.newBuffer());
        dummy.setTransactionId(1);
        assertNotNull(dummy.getData());
        assertEquals(1, dummy.getTransactionId());
    }

}