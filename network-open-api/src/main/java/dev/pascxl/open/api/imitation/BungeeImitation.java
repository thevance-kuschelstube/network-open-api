package dev.pascxl.open.api.imitation;


import net.md_5.bungee.api.plugin.Plugin;

import java.util.logging.Level;

/**
 * Created by P. Kurz on 28.02.2023 (user: Pascal).
 */
public class BungeeImitation extends Plugin {

    @Override
    public void onEnable() {
        this.getLogger().log(Level.INFO, "Plugin Imitation started.");
    }

    @Override
    public void onDisable() {
        this.getLogger().log(Level.INFO, "Plugin Imitation started.");
    }
}
