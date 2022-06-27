package com.javaconfig.practise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
 * 1.This class will work as exactly same as XML file, We have configured and set @ComponentScan
 * Also we need to add @Compnet to all the class to get auto-generated bean ID
 * 
 * 2. We can also use auto wired and it will act like XML
 */


@Configuration
@ComponentScan("com.javaconfig.practise")  //If we will use this we no need to define bean
@PropertySource("classpath:javaConfig.properties")
public class SportConfig {

}
