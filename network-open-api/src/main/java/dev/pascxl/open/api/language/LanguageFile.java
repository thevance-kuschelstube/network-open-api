package dev.pascxl.open.api.language;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface LanguageFile {

    String fileName();

    HashMap<String, String> messages();

    LanguageFile insertMessages(LanguageMessage... messages);

    LanguageFile insertMessages(List<LanguageMessage> messages);

    LanguageFile insertMessages(Map<String, String> messages);

    LanguageMessage messageInput(String key);

    String messageRaw(String key);

    String message(String key, Object... arguments);

}
