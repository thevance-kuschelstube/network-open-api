package api;

import api.mongodb.ConnectionHandler;
import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * Created by P. Kurz on 26.02.2023 (user: Pascal).
 */
@Accessors(fluent = true)
@Getter
public abstract class OpenAPI {

    private static OpenAPI instance;

    private final ConnectionHandler connectionHandler;

    protected OpenAPI(ConnectionHandler connectionHandler) {
        instance = this;
        this.connectionHandler = connectionHandler;
    }

}
