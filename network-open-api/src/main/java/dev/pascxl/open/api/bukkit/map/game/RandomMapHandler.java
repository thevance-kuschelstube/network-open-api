package dev.pascxl.open.api.bukkit.map.game;

import dev.pascxl.open.api.bukkit.map.ForceMap;
import dev.pascxl.open.api.bukkit.map.Map;
import dev.pascxl.open.api.bukkit.map.MapProvider;

import java.util.List;
import java.util.UUID;

/**
 * Created by P. Kurz on 02.03.2023 (user: Pascal).
 */
public interface RandomMapHandler {

    MapProvider mapProvider();

    MapSwitchTaskHandler mapSwitchTaskHandler();

    MapSwitchTask mapSwitchTask();

    ForceMap latestForceMap();

    List<ForceMap> forceMaps();

    List<ForceMap> forceMapsAllTime();

    void forceMap(UUID uuid, String mapId);

    void removeForceMap();

    void removeForceMap(UUID uuid);

    Map generateRandomMap();

    boolean reload();

    void redialRandomMap();

}
