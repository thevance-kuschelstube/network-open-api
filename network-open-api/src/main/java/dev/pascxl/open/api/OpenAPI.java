package dev.pascxl.open.api;

import com.mongodb.client.MongoDatabase;
import dev.pascxl.open.api.async.ProcessQueue;
import dev.pascxl.open.api.domain.DomainProvider;
import dev.pascxl.open.api.language.LanguageProvider;
import dev.pascxl.open.api.mongodb.ConnectionHandler;
import dev.pascxl.open.api.mongodb.ConnectionProvider;
import dev.pascxl.open.api.permissions.rank.RankProvider;
import dev.pascxl.open.api.platform.APIPlatform;
import dev.pascxl.open.api.player.NetworkPlayerProvider;
import dev.pascxl.open.api.redis.RedisClient;
import dev.pascxl.open.api.utilities.UtilityProvider;
import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * Created by P. Kurz on 26.02.2023 (user: Pascal).
 */
@Accessors(fluent = true)
@Getter
public abstract class OpenAPI {

    @Getter
    private static OpenAPI instance;

    protected final APIPlatform<?, ?> apiPlatform;
    protected final ConnectionHandler connectionHandler;
    protected final RedisClient redisClient;
    protected final ConnectionProvider apiConnectionProvider;
    protected final UtilityProvider utilityProvider;
    protected final ProcessQueue processQueue;
    protected final NetworkPlayerProvider networkPlayerProvider;
    protected final LanguageProvider languageProvider;
    protected final RankProvider rankProvider;
    protected final DomainProvider domainProvider;
    protected final MongoDatabase mongoDatabase;

    protected OpenAPI(APIPlatform<?, ?> apiPlatform, ConnectionHandler connectionHandler, RedisClient redisClient, ConnectionProvider apiConnectionProvider, UtilityProvider utilityProvider, ProcessQueue processQueue, NetworkPlayerProvider networkPlayerProvider, LanguageProvider languageProvider, RankProvider rankProvider, DomainProvider domainProvider, MongoDatabase mongoDatabase) {
        this.mongoDatabase = mongoDatabase;
        instance = this;
        this.processQueue = processQueue;
        this.networkPlayerProvider = networkPlayerProvider;
        this.languageProvider = languageProvider;
        this.apiPlatform = apiPlatform;
        this.redisClient = redisClient;
        this.utilityProvider = utilityProvider;
        this.connectionHandler = connectionHandler;
        this.apiConnectionProvider = apiConnectionProvider;
        this.rankProvider = rankProvider;
        this.domainProvider = domainProvider;
    }

    public void terminate() {
    }

}
