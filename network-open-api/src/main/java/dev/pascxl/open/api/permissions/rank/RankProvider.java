package dev.pascxl.open.api.permissions.rank;

import eu.cloudnetservice.driver.permission.PermissionManagement;

import java.util.UUID;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface RankProvider {

    PermissionManagement cloudPermissionManagement();

    RankRepository repository();

    Rank anyDefault();

    Rank byName(String name);

    Rank byUUid(UUID uniqueId);

    Rank calculateRank(UUID playerUniqueId, String name);

}
