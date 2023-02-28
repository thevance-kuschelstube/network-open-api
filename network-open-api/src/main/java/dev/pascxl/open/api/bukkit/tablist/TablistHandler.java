package dev.pascxl.open.api.bukkit.tablist;

import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * Created by Pascal K. on 13.02.2023.
 */
@Accessors(fluent = true)
@Getter
public class TablistHandler {

    private Tablist currentTablist;

    public void registerTablist(Tablist tablist) {
        this.currentTablist = tablist;
    }


}
