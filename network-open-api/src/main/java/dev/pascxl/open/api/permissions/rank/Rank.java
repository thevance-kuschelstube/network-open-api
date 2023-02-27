package dev.pascxl.open.api.permissions.rank;

import java.util.UUID;

/**
 * Created by P. Kurz on 27.02.2023 (user: Pascal).
 */
public interface Rank {

    String id();

    String cloudGroupName();

    String discordGroupId();

    String languageKey();

    String sort();

    boolean useAsDefault();

    boolean teamRank();

    String altColorCode();

    String hexColorCode();

    String backPrefixSymbol();

    String frontPrefixSymbol();

    String generatePrefixAltAsString(UUID uuid);

}
