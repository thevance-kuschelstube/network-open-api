package dev.pascxl.open.api.utilities;

/**
 * Created by Pascal K. on 19.10.2022.
 */
public interface Catcher<E, V> {
    E doCatch(V var1);
}