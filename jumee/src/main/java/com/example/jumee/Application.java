package com.example.jumee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class Application 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Spring Cloud!" );
        SpringApplication.run(Application.class, args);
    }
}
