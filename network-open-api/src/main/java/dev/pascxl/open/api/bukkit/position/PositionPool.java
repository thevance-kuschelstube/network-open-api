package dev.pascxl.open.api.bukkit.position;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

/**
 * JavaDoc this file!
 * Created: 06.04.2022
 *
 * @author GolgolexTV (golgolex@golgolex.de)
 */
@Getter
@AllArgsConstructor
public class PositionPool {

    private String plugin;

    private Map<String, Position> positions;

}