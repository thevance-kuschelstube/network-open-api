package api.mongodb;

import java.util.Map;

/**
 * Created by P. Kurz on 26.02.2023 (user: Pascal).
 */
public interface ConnectionHandler {

    Map<String, ConnectionProvider> connections();

    ConnectionProvider openConnection(String id, String string);

    ConnectionProvider provider(String id);

    ConnectionProvider getOrOpen(String id, String string);

    void terminate();

}
