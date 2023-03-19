package com.kenshin.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(value = {"com.kenshin.service"})
@PropertySource("classpath:jdbc.properties")
@Import(value = {JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {

}
