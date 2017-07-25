package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */

@EnableEurekaServer
@SpringBootApplication
public class Application 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Eureka Server!" );
        SpringApplication.run(Application.class, args);
    }
}
