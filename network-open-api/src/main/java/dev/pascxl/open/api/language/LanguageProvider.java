package dev.pascxl.open.api.language;

import java.util.List;
import java.util.UUID;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface LanguageProvider {

    LanguageRepository repository();

    Language byName(String name);

    Language byUUid(UUID uuid);

    Language anyDefault();

    void addMessageEvery(String fileId, LanguageMessage... messages);

    void addMessageEvery(String fileId, List<LanguageMessage> messages);

    LanguageMessage createMessage(String key, String message);

}
