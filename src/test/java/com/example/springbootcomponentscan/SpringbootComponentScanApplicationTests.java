package com.example.springbootcomponentscan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootComponentScanApplicationTests {

    @Autowired
    ApplicationContext context;

    @Test
    public void contextLoads() {
        assertTrue(context.containsBeanDefinition("XXX"));
        assertFalse(context.containsBeanDefinition("YYY"));

        assertTrue(context.containsBeanDefinition("XXX2"));
    }

}
