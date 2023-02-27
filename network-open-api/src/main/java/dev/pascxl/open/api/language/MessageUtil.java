package dev.pascxl.open.api.language;

import org.bson.Document;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface MessageUtil {

    String findMessage(Document document, String key);

    String convertMessage(Document document, String key, Object... values);

    String getMessage(String rawMessage, Object... objects);

    static String translateAlternateColorCodes(char altColorChar, String textToTranslate) {
        char[] b = textToTranslate.toCharArray();
        for (int i = 0; i < b.length - 1; ++i) {
            if (b[i] == altColorChar && "0123456789AaBbCcDdEeFfKkLlMmNnOoRr".indexOf(b[i + 1]) > -1) {
                b[i] = 167;
                b[i + 1] = Character.toLowerCase(b[i + 1]);
            }
        }
        return new String(b);
    }

}
