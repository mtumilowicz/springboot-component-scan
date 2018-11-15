package com.example.springbootcomponentscan;

import bean2.ScanBean2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springbootcomponentscan"}, basePackageClasses = ScanBean2.class)
public class SpringbootComponentScanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootComponentScanApplication.class, args);
    }
}
