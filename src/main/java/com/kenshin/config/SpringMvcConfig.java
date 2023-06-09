package com.kenshin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.kenshin.controller","com.kenshin.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
