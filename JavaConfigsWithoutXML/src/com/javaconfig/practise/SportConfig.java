package com.javaconfig.practise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * This class will work as exactly same as XML file, We have configured and set @ComponentScan
 * Also we need to add @Compnet to all the class to get auto-generated bean ID
 */

@Configuration
@ComponentScan("com.javaconfig.practise")
public class SportConfig {

}
