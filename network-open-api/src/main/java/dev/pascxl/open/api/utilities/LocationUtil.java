package dev.pascxl.open.api.utilities;

import dev.pascxl.open.api.bukkit.position.Position;
import dev.pascxl.open.api.bukkit.position.PositionMeta;
import org.bukkit.Location;
import org.bukkit.util.BoundingBox;

import java.util.Collection;

/**
 * Created by P. Kurz on 28.02.2023 (user: Pascal).
 */
public interface LocationUtil {

    String toString(Location location);

    BoundingBox boundingBox(Position firstPosition, Position secondPosition);

    BoundingBox boundingBox(Location firstLocation, Location secondLocation);

    Doubled<Location, Collection<PositionMeta>> location(Position position);

    Position position(Location location, PositionMeta... positionMetas);

    String[] messageString(Location location);

    Location location(String locationString);

    boolean same(Location var1, Location var2);

    boolean same(Location var1, Position var2);

}
