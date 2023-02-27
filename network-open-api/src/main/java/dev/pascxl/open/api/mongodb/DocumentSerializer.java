package dev.pascxl.open.api.mongodb;

import org.bson.Document;

public interface DocumentSerializer<T> {

    Document serialize( T t );

    T deserialize( Document document );
}
