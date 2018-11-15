package com.example.springbootcomponentscan;

import bean2.Scan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springbootcomponentscan"}, basePackageClasses = Scan.class)
public class SpringbootComponentScanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootComponentScanApplication.class, args);
    }
}
