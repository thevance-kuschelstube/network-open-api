package dev.pascxl.open.api.configuration;

import java.util.Map;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface APIConfiguration {

    String mongoHost();
    String mongoUser();
    Integer mongoPort();
    String mongoPassword();
    String mongoDatabase();

    String redisHost();
    Integer redisPort();
    String redisPassword();

    Map<String, Object> additional();

}
