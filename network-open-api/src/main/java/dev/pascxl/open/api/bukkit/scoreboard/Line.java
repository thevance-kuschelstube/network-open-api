package dev.pascxl.open.api.bukkit.scoreboard;

import net.kyori.adventure.text.Component;

/**
 * Created by Pascal K. on 06.02.2023.
 */
public record Line(
        Component content,
        int score
) {

}
