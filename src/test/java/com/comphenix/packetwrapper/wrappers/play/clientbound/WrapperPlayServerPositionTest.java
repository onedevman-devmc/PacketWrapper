package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 15.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerPositionTest {
    @Test
    public void test() {
        WrapperPlayServerPosition dummy = new WrapperPlayServerPosition();
        dummy.setRelativeArguments(Set.of(WrapperPlayServerPosition.RelativeMovement.X, WrapperPlayServerPosition.RelativeMovement.X_ROT));
        Set<WrapperPlayServerPosition.RelativeMovement> restored = dummy.getRelativeArguments();
        assertEquals(2, restored.size());
        assertTrue(restored.contains(WrapperPlayServerPosition.RelativeMovement.X));
        assertTrue(restored.contains(WrapperPlayServerPosition.RelativeMovement.X_ROT));
    }
}