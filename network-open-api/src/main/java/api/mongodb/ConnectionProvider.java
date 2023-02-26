package api.mongodb;

import com.mongodb.client.MongoClient;

/**
 * Created by P. Kurz on 26.02.2023 (user: Pascal).
 */
public interface ConnectionProvider {

    MongoClient mongoClient();

}
