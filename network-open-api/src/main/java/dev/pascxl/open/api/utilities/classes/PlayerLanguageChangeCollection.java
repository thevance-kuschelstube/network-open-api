package dev.pascxl.open.api.utilities.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
@Getter
@AllArgsConstructor
public class PlayerLanguageChangeCollection {

    private final String oldLanguage;
    private final String newLanguage;
    private final UUID uniqueId;

}
