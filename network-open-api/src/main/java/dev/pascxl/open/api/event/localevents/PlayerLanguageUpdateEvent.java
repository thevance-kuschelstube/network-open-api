package dev.pascxl.open.api.event.localevents;

import dev.pascxl.open.api.event.MultiPlatformEvent;
import dev.pascxl.open.api.language.Language;

import java.util.UUID;

/**
 * Created by P. Kurz on 02.03.2023 (user: Pascal).
 */
public interface PlayerLanguageUpdateEvent extends MultiPlatformEvent {

    UUID uniqueId();

    Language newLanguage();

    Language oldLanguage();

    String executor();

}
