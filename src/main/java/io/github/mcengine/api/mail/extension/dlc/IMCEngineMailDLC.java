package io.github.mcengine.api.mail.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Mail DLC module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate downloadable content related to mail.
 */
public interface IMCEngineMailDLC {
    /**
     * Called when the Mail DLC is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Mail DLC is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Mail DLC instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
