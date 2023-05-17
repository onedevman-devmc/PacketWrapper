package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import org.bukkit.potion.PotionEffectType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 17.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerEntityEffectTest {
    @Test
    public void test() {
        WrapperPlayServerEntityEffect dummy = new WrapperPlayServerEntityEffect();
        dummy.setEntityId(1);
        dummy.setEffectAmplifier((byte) 2);
        dummy.setFlags((byte) (0x1 | 0x8));
        dummy.setEffectDurationTicks(1337);
        dummy.setEffect(PotionEffectType.ABSORPTION);
        dummy.setFactorData(null);
        assertNull(dummy.getFactorData());
        WrapperPlayServerEntityEffect.WrappedFactorData factorData = new WrapperPlayServerEntityEffect.WrappedFactorData();
        factorData.setFactorStart(1.3F);
        factorData.setHadEffectLastTick(true);
        factorData.setFactorPreviousFrame(3);
        dummy.setFactorData(factorData);
        assertEquals(factorData, dummy.getFactorData());
        assertEquals(PotionEffectType.ABSORPTION, dummy.getEffect());
    }
}