package it.dstech.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    @Value("${common.config}")
    private String common;

    @Value("${env.config}")
    private String env;

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner runner() {
//        return (args) -> {
//            System.out.println(common);
//            System.out.println(env);
//        };
//    }
}
