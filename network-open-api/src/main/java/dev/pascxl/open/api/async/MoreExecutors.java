package dev.pascxl.open.api.async;

import com.google.common.util.concurrent.ListeningExecutorService;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface MoreExecutors {

    static Executor directExecutor() {
        return Runnable::run;
    }

    static ListeningExecutorService asyncExecutor() {
        return com.google.common.util.concurrent.MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());
    }

}
