package dev.pascxl.open.api.domain;

import java.util.List;

/**
 * Created by P. Kurz on 26.02.2023 (user: Pascal).
 */
public interface DomainProvider {

    List<Domain> values();

    DomainRepository repository();

    Domain anyDefault();

}
