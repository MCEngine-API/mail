package io.github.mcengine.api.mail.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Mail Library module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide reusable mail utilities and services.
 */
public interface IMCEngineMailLibrary {
    /**
     * Called when the Mail Library is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Mail Library is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Mail Library instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
