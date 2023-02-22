package cz.monetplus.transport.termix.config;

import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Alois Šenkyřík asenkyrik@monetplus.cz
 * @version 1.0
 * Created: 22.02.2023
 */

@Slf4j
@Configuration
public class JavaMvcConfiguration {
    private final BuildProperties buildProperties;

    public JavaMvcConfiguration(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
        log.info("Current build version -> {}", buildProperties.getVersion());
    }

}
