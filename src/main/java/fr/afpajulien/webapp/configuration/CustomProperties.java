package fr.afpajulien.webapp.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "fr.afpajulien.webapp")
public class CustomProperties {

    private String apiUrl;

}
