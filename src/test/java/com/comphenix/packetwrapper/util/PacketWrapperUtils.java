package com.comphenix.packetwrapper.util;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;

import java.util.Set;

/**
 * @author Lukas Alt
 * @since 07.05.2023
 */
public class PacketWrapperUtils {
    public static Set<Class<?>> getPacketWrappers() throws Exception {
        return Utils.getClassesInPackage("com.comphenix.packetwrapper", AbstractPacket.class);
    }
}
