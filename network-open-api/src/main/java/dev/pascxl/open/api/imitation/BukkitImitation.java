package dev.pascxl.open.api.imitation;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 * Created by P. Kurz on 28.02.2023 (user: Pascal).
 */
public class BukkitImitation extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().log(Level.INFO, "Plugin Imitation started.");
    }

    @Override
    public void onDisable() {
        this.getLogger().log(Level.INFO, "Plugin Imitation started.");
    }
}
