package dev.pascxl.open.api.utilities.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.UUID;

/**
 * Created by Pascal K. on 04.02.2023.
 */
@Accessors(fluent = true)
@Getter
@AllArgsConstructor
public class ServerSwitchElement {

    private final UUID uniqueId;
    private final String serverId;

}
