package io.github.mcengine.api.mail.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Mail API module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to expose mail APIs to other modules.
 */
public interface IMCEngineMailAPI {
    /**
     * Called when the Mail API is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Mail API is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Mail API instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
