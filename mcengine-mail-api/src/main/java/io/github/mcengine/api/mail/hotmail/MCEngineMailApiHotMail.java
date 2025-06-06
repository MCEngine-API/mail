package io.github.mcengine.api.mail.hotmail;

import com.google.gson.Gson;
import io.github.mcengine.api.mail.IMCEngineMailApi;
import io.github.mcengine.api.mail.util.MCEngineMailPayload;

/**
 * HotMail simulation of the Mail API using Gson.
 */
public class MCEngineMailApiHotMail implements IMCEngineMailApi {

    private final Gson gson = new Gson();

    @Override
    public void sendMail(String senderMail, String senderUserName, String senderPassword, String receiverMail, String title, String text) {
        MCEngineMailPayload payload = new MCEngineMailPayload(senderMail, senderUserName, senderPassword, receiverMail, title, text);
        String json = gson.toJson(payload);

        System.out.println("[HotMail] Simulated Email JSON:");
        System.out.println(json);
    }
}
