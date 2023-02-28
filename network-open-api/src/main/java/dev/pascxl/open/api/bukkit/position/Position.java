package dev.pascxl.open.api.bukkit.position;

import java.util.Collection;

/**
 * Created by P. Kurz on 28.02.2023 (user: Pascal).
 */
public interface Position {

    double x();

    double y();

    double z();

    float yaw();

    float pitch();

    String worldName();

    Collection<PositionMeta> positionMetas();

}
