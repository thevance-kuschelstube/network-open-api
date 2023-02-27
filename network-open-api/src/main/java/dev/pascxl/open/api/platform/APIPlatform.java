package dev.pascxl.open.api.platform;

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

    boolean proxyPlatform();

}
