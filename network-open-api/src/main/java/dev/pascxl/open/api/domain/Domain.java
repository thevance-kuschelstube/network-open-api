package dev.pascxl.open.api.domain;

import java.util.HashMap;
import java.util.List;

/**
 * Created by P. Kurz on 26.02.2023 (user: Pascal).
 */
public interface Domain {

    String name();
    String topLevelDomain();
    List<String> tag();
    HashMap<String, String> socialMedia();

    String hexColoring();
    String altColoring();
    boolean ableAsDefault();
    
}
