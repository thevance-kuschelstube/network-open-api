package dev.pascxl.open.api.permissions.rank;

import dev.pascxl.open.api.mongodb.IRepositoryWithCache;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface RankRepository extends IRepositoryWithCache<Rank, String> {

    RankSerializer serializer();

    void loadAll();

    void integrateLanguageProperties();

}
