package dev.pascxl.open.api.bukkit.map.game;

/**
 * Created by P. Kurz on 02.03.2023 (user: Pascal).
 */
public interface MapSwitchTaskHandler {

    MapSwitchTask createInstance(Runnable runnable);

}
