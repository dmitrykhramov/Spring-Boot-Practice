package com.dmitrykhramov.spring.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dmitry on 02.01.2017.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.dmitrykhramov.spring")
public class JpaIntegrationConfig {
}
