package dev.pascxl.open.api.bukkit.events;

import dev.pascxl.open.api.event.MultiPlatformEvent;
import dev.pascxl.open.api.language.Language;
import dev.pascxl.open.api.permissions.rank.Rank;
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
public class PlayerLanguageUpdateEvent extends Event implements MultiPlatformEvent {

    private static final HandlerList handlers = new HandlerList();

    private final UUID uniqueId;
    private final Language newLanguage;
    private final Language oldLanguage;
    private final String executor;

    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static @NotNull HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean async() {
        return false;
    }
}