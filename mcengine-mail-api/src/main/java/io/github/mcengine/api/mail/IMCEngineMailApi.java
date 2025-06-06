package io.github.mcengine.api.mail;

/**
 * Interface representing the Mail API for MCEngine.
 */
public interface IMCEngineMailApi {

    /**
     * Simulates sending an email by serializing email data into JSON.
     *
     * @param senderMail      The sender's email address.
     * @param senderUserName  The SMTP username.
     * @param senderPassword  The SMTP password or token.
     * @param receiverMail    The receiver's email address.
     * @param title           The subject of the email.
     * @param text            The message content.
     */
    void sendMail(String senderMail, String senderUserName, String senderPassword, String receiverMail, String title, String text);
}
