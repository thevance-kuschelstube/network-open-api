package dev.pascxl.open.api.player;

import org.bson.Document;

import java.util.Collection;
import java.util.UUID;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface NetworkPlayerProvider {

    Collection<NetworkPlayer<?>> cachedPlayers();

    <T extends NetworkPlayer<?>> T networkPlayer(UUID uniqueId);

    <T extends NetworkPlayer<?>> T networkPlayer(String username);

    <T extends NetworkPlayer<?>> T create(UUID uuid, String username, T player, Document properties);

}
