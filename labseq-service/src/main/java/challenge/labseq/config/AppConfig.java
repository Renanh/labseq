package challenge.labseq.config;

import challenge.labseq.cache.Cache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Cache cache() {
        return new Cache();
    }
}
