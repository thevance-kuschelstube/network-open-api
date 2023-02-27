package dev.pascxl.open.api.language;

import dev.pascxl.open.api.OpenAPI;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface LanguageMessage {

    static LanguageMessage of(String key, String message) {
        return OpenAPI.instance().languageProvider().createMessage(key, message);
    }

    String key();

    String value();
}
