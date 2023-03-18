package com.kenshin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = {"com.kenshin.service"})
@PropertySource("classpath:jdbc.properties")
@Import(value = {JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {

}
