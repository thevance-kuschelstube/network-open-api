package dev.pascxl.open.api.bukkit.events;

import dev.pascxl.open.api.bukkit.map.Map;
import dev.pascxl.open.api.bukkit.map.MapProvider;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Pascal K. on 06.02.2023.
 */
@Accessors(fluent = true)
@Getter
@AllArgsConstructor
public class RandomMapChangedEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final MapProvider mapProvider;
    private final Map lastMap;
    private final Map newMap;

    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static @NotNull HandlerList getHandlerList() {
        return handlers;
    }

}