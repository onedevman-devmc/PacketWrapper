package com.comphenix.packetwrapper.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 15.05.2023
 */
class ProtocolConversionTest {
    @Test
    public void testDegreeRotationConversion() {
        for(int deg = 0; deg <= 360; deg++) {

            ProtocolConversion.angleToDegrees(ProtocolConversion.degreesToAngle((float) deg));
        }
    }
}