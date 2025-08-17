package io.github.mcengine.api.mail.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Mail Agent module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate mail agents into the system.
 */
public interface IMCEngineMailAgent {
    /**
     * Called when the Mail Agent is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Mail Agent is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Mail Agent instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
