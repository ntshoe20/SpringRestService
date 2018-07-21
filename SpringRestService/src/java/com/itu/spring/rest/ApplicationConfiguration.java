package com.itu.spring.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
 * fourth class, this is the configuration of our spring service before we expose it.
 * 2018-07-21
 * Itumeleng Ntshoe
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.itu.spring.rest")
public class ApplicationConfiguration {

}
