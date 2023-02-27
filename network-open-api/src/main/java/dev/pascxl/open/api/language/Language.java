package dev.pascxl.open.api.language;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface Language {

    UUID uniqueId();

    String name();

    String fileKey();

    String nameKey();

    List<String> tags();

    HashMap<String, LanguageFile> files();

    boolean useAsDefault();

    Language insertFile(LanguageFile... files);

    LanguageFile file(String name);

    void syncDatabase();

}
