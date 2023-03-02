package dev.pascxl.open.api.platform;

import dev.pascxl.open.api.OpenAPI;
import dev.pascxl.open.api.event.MultiPlatformEvent;

import java.util.logging.Logger;

/**
 * Created by Pascal K. on 01.02.2023.
 */
public interface APIPlatform<TPlayer, TInstance> {

    TPlayer player(String identifier);

    Logger logger();

    TInstance pluginInstance();

    void toServer(TPlayer player, String taskId);

    void initialize();

    void terminate();

    void registerCollectives();

    void callEvent(MultiPlatformEvent event);

    void registerStuff(OpenAPI openAPI);

    boolean proxyPlatform();

}
