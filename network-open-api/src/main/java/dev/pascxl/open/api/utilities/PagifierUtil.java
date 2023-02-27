package dev.pascxl.open.api.utilities;

import dev.pascxl.open.api.OpenAPI;

import java.util.List;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface PagifierUtil<TElement> {

    static <T> PagifierUtil<T> create(int length) {
        return OpenAPI.instance().utilityProvider().pagefier(length);
    }

    int pageLength();

    List<List<TElement>> pages();

    void add(TElement element);

    List<TElement> page(int pageNum);

    List<TElement> elements();

    boolean isPageExists(int pageNum);

    void clear();

}
