package dev.pascxl.open.api.bukkit.tablist;

import org.bukkit.entity.Player;

import java.util.HashMap;

/**
 * Created by P. Kurz on 28.02.2023 (user: Pascal).
 */
public interface Tablist {

    HashMap<String, TablistLayout> entries();

    void addedEntry(Player player, TablistLayout tablistLayout);

    void removedEntry(Player player);

    void updateFor(Player player);

    void insertTeam(Player player, TablistLayout tablistLayout);

    default void addEntry(Player player) {
        if (this.entries().containsKey(player.getName())) return;
        this.entries().put(player.getName(), null);
        this.addedEntry(player, null);
    }

    default void removeEntry(Player player) {
        if (!this.entries().containsKey(player.getName())) return;
        this.removedEntry(player);
        this.entries().remove(player.getName());
    }

}
