package io.github.mcengine.api.mail.util;

public class MCEngineMailPayload {
    public String senderMail;
    public String senderUserName;
    public String senderPassword;
    public String receiverMail;
    public String title;
    public String text;

    public MCEngineMailPayload(String senderMail, String senderUserName, String senderPassword,
                       String receiverMail, String title, String text) {
        this.senderMail = senderMail;
        this.senderUserName = senderUserName;
        this.senderPassword = senderPassword;
        this.receiverMail = receiverMail;
        this.title = title;
        this.text = text;
    }
}
