package dev.pascxl.open.api.bukkit.scoreboard;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by P. Kurz on 28.02.2023 (user: Pascal).
 */
public interface Sidebar {

    String key();

    Player player();

    Component displayName();

    List<Line> lines();

    Scoreboard scoreboard();

    Consumer<Sidebar> update();

    BarState barState();

    Sidebar addIdentity(String value);

    Sidebar manipulateUpdateExecutor(Consumer<Sidebar> action);

    Sidebar addLine(Component... content);

    Sidebar updateLine(Component component, int score);

    Sidebar updateDisplayName(Component component);

    void generate();

    void sendUpdate();

}
