package io.github.mcengine.api.mail.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Mail Skript module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate scripted content for mail.
 */
public interface IMCEngineMailSkript {
    /**
     * Called when the Mail Skript module is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Mail Skript module is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Mail Skript instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
