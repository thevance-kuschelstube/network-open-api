package dev.pascxl.open.api.language;

import dev.pascxl.open.api.mongodb.IRepositoryWithCache;

import java.util.Collection;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface LanguageRepository extends IRepositoryWithCache<Language, String> {

    Collection<Language> values();

    void loadAll();

}
