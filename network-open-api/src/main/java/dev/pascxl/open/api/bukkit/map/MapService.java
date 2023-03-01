package dev.pascxl.open.api.bukkit.map;

import java.util.HashMap;

/**
 * Created by P. Kurz on 01.03.2023 (user: Pascal).
 */
public interface MapService {

    HashMap<String, MapProvider> mapProviders();

    MapProvider provider(String poolName);

    Map convert(String name, String worldName);

}
