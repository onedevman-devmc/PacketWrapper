package com.comphenix.packetwrapper;

import com.comphenix.packetwrapper.util.BukkitInitialization;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Lukas Alt
 * @since 08.05.2023
 */
public class BaseTestInitialization implements BeforeAllCallback, ExtensionContext.Store.CloseableResource {
    private final static AtomicBoolean started = new AtomicBoolean(false);

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
        if(started.compareAndSet(false, true)) {
            try {
                BukkitInitialization.initializeAll();
            } catch (Throwable t) {
                throw new RuntimeException("Failed to initialize bukkit support", t);
            }
            extensionContext.getRoot().getStore(ExtensionContext.Namespace.GLOBAL).put("bukkit-initialization", this);
        }
    }

    @Override
    public void close() {
    }
}
