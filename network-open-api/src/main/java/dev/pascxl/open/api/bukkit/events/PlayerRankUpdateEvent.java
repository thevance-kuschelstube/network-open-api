package dev.pascxl.open.api.bukkit.events;

import dev.pascxl.open.api.bukkit.map.Map;
import dev.pascxl.open.api.bukkit.map.MapProvider;
import dev.pascxl.open.api.permissions.rank.Rank;
import dev.pascxl.open.api.player.NetworkPlayer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * Created by Pascal K. on 06.02.2023.
 */
@Accessors(fluent = true)
@Getter
@AllArgsConstructor
public class PlayerRankUpdateEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final UUID uniqueId;
    private final Rank newRank;
    private final Rank oldRank;
    private final String executor;

    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static @NotNull HandlerList getHandlerList() {
        return handlers;
    }

}