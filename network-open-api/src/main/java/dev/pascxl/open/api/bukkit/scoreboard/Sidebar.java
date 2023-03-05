package dev.pascxl.open.api.bukkit.scoreboard;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
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

    Sidebar titleAnimation(List<Component> components);

    Sidebar addIdentity(String value);

    Sidebar manipulateUpdateExecutor(Consumer<Sidebar> action);

    Sidebar addLine(Component... content);

    Sidebar updateLine(Component component, int score);

    Sidebar updateDisplayName(Component component);

    void stopTitleAnimation();

    void titleAnimationTicks(int i);

    void startTitleAnimation(Plugin plugin);

    void generate();

    void sendUpdate();

}
