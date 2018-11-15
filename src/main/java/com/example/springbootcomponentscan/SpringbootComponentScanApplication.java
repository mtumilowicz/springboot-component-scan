package com.example.springbootcomponentscan;

import outsiders1.ScanOutsiders1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springbootcomponentscan"}, basePackageClasses = ScanOutsiders1.class)
public class SpringbootComponentScanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootComponentScanApplication.class, args);
    }
}
