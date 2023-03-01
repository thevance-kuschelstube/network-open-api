package dev.pascxl.open.api.bukkit.map;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

/**
 * Created by P. Kurz on 01.03.2023 (user: Pascal).
 */
@Getter
@AllArgsConstructor
public class MapPool {

    private String plugin;

    private HashMap<String, Map> maps;

}
