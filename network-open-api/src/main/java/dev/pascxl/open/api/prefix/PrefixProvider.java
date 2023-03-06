package dev.pascxl.open.api.prefix;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by P. Kurz on 06.03.2023 (user: Pascal).
 */
public interface PrefixProvider {

    static String collectionName() {
        return "prefixes";
    }

    Map<UUID, List<CachedPrefix>> prefixes();

    PrefixProvider checkOrInsert(String key, String value);

    String prefix(String key, UUID playerId);

}
