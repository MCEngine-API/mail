package io.github.mcengine.api.mail;

import io.github.mcengine.api.mail.gmail.MCEngineMailApiGmail;
import io.github.mcengine.api.mail.hotmail.MCEngineMailApiHotMail;
import org.bukkit.plugin.Plugin;

/**
 * Main Mail API class used by MCEngine plugins.
 * Automatically selects and initializes the appropriate mail implementation.
 */
public class MCEngineMailApi {

    /**
     * Singleton instance of the Mail API.
     */
    private static MCEngineMailApi instance;

    /**
     * The Bukkit plugin instance associated with this API.
     */
    private final Plugin plugin;

    /**
     * The active mail API implementation.
     */
    private final IMCEngineMailApi mailApi;

    /**
     * Constructs a new Mail API instance.
     *
     * @param plugin The Bukkit plugin using this API.
     */
    public MCEngineMailApi(Plugin plugin) {
        instance = this;
        this.plugin = plugin;

        // Load the configured mail type
        String mailType = plugin.getConfig().getString("mail.type", "hotmail").toLowerCase();

        switch (mailType) {
            case "gmail":
                mailApi = new MCEngineMailApiGmail();
                break;
            case "hotmail":
            default:
                mailApi = new MCEngineMailApiHotMail();
                break;
        }
    }

    /**
     * Gets the singleton API instance.
     *
     * @return The Mail API instance.
     */
    public static MCEngineMailApi getApi() {
        return instance;
    }

    /**
     * Gets the Bukkit plugin instance.
     *
     * @return The plugin instance.
     */
    public Plugin getPlugin() {
        return plugin;
    }

    /**
     * Sends an email using the selected implementation.
     *
     * @param senderMail      The sender's email address.
     * @param senderUserName  The SMTP username.
     * @param senderPassword  The SMTP password or token.
     * @param receiverMail    The receiver's email address.
     * @param title           The subject of the email.
     * @param text            The content of the email.
     */
    public void sendMail(String senderMail, String senderUserName, String senderPassword, String receiverMail, String title, String text) {
        mailApi.sendMail(senderMail, senderUserName, senderPassword, receiverMail, title, text);
    }
}
