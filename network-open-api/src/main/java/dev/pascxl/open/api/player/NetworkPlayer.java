package dev.pascxl.open.api.player;

import dev.pascxl.open.api.domain.Domain;
import dev.pascxl.open.api.language.Language;
import dev.pascxl.open.api.permissions.rank.Rank;
import org.bson.Document;

import java.util.UUID;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface NetworkPlayer<TPlayer> {

    UUID uuid();

    String username();

    Document local();

    TPlayer player();

    Document properties();

    Rank rank();

    Rank rank(Rank rank);

    Language language();

    Language language(Language language);

    Domain domain();

    Domain domain(Domain domain);

    void player(TPlayer player);

    <E> E property(NetworkPlayerProperty<E> property);

    <E> E noCachedProperty$(NetworkPlayerProperty<E> property);

    <E> void $updateProperty(NetworkPlayerProperty<E> property, E value);

    <E> void updatePropertyAsync(NetworkPlayerProperty<E> property, E value);

    <E> void updateProperty(NetworkPlayerProperty<E> property, E value);

    <E> void updatePropertyNoSync(NetworkPlayerProperty<E> property, E value);

    void sync();

    void syncToDatabase();

    void reload(Document propertyDoc);

}
