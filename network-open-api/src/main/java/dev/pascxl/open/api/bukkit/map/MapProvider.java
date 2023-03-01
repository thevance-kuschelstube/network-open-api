package dev.pascxl.open.api.bukkit.map;

import com.mongodb.client.MongoCollection;
import dev.pascxl.open.api.bukkit.position.Position;
import org.bson.Document;

import java.util.HashMap;

/**
 * Created by P. Kurz on 01.03.2023 (user: Pascal).
 */
public interface MapProvider {

    MongoCollection<Document> mapDocs();

    String poolName();

    Document cache();

    void createMap(String locationName, Map map);

    void updateMap(String locationName, Map map);

    void deleteMao(String locationName);

    Map map(String positionName);

    HashMap<String, Map> maps();

}
