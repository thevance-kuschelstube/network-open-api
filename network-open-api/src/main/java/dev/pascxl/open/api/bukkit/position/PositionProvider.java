package dev.pascxl.open.api.bukkit.position;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Map;

/**
 * Created by P. Kurz on 28.02.2023 (user: Pascal).
 */
public interface PositionProvider {

    MongoCollection<Document> locationDocs();

    String poolName();

    Document cache();

    void createPosition(String locationName, Position position);

    void updatePosition(String locationName, Position position);

    void deletePosition(String locationName);

    Position getPosition(String positionName);

    Map<String, Position> getPositions();

}
