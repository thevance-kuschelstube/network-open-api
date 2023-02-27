package dev.pascxl.open.api.mongodb;

import org.bson.Document;

import java.lang.reflect.Type;

/**
 * Created by P. Kurz on 26.02.2023 (user: Pascal).
 */
public interface GsonToBsonAdapter {

    Document document(Object value);

    <T> T objective(Document document, Type type);

}