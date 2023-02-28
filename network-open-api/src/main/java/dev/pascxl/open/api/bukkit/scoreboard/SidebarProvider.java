package dev.pascxl.open.api.bukkit.scoreboard;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by P. Kurz on 28.02.2023 (user: Pascal).
 */
public interface SidebarProvider {

    HashMap<UUID, Sidebar> sidebars();

    Sidebar sidebar(Player player, Component title);

    Sidebar cachedOne(Player player);

    void updateSidebar(Player player);

    void updateSidebarForAll();

    void handleDisconnect(Player player);

}
