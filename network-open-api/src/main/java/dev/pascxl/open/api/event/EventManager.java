package dev.pascxl.open.api.event;

import java.util.Map;

/**
 * Created by P. Kurz on 02.03.2023 (user: Pascal).
 */
public interface EventManager {

    Map<String, MultiPlatformEvent> registered();

    void callIfRegistered(String s);

    void call(MultiPlatformEvent event);

    void registerEvent(MultiPlatformEvent event);

    void unregisterEvent(String s);

}
