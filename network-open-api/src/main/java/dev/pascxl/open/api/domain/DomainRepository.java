package dev.pascxl.open.api.domain;

import dev.pascxl.open.api.mongodb.IRepositoryWithCache;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface DomainRepository extends IRepositoryWithCache<Domain, String> {

    DomainSerializer serializer();

    void loadAll();

}
