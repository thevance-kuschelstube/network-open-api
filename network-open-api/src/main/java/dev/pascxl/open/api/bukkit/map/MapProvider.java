package dev.pascxl.open.api.bukkit.map;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bukkit.World;

import java.util.HashMap;
import java.util.List;

/**
 * Created by P. Kurz on 01.03.2023 (user: Pascal).
 */
public interface MapProvider {

    MongoCollection<Document> mapDocs();

    String poolName();

    Document cache();

    void createMap(String mapName, Map map);

    void updateMap(String mapName, Map map);

    void deleteMap(String mapName);

    World initOnBukkit(String mapName);

    List<World> initOnBukkitAll();

    Map map(String mapName);

    HashMap<String, Map> maps();

}
