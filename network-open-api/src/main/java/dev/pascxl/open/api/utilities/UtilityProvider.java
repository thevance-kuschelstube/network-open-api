package dev.pascxl.open.api.utilities;

import dev.pascxl.open.api.language.MessageUtil;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface UtilityProvider {

    <T> PagifierUtil<T> pagefier(int pageLength);

    MessageUtil messageUtil();

    PasswordAuth passwordAuth();

}
