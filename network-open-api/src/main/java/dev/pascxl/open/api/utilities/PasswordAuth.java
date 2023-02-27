package dev.pascxl.open.api.utilities;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface PasswordAuth {

    String hash(String password);

    boolean match(String hash, String should);

}
