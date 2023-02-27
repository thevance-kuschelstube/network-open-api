package dev.pascxl.open.api.async;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface ProcessQueue {

    void runTask(Runnable runnable);

}
