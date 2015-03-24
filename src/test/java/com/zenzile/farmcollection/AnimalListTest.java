/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.farmcollection;

import com.zenzile.farmcollection.config.AppConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author SIHLE
 */
public class AnimalListTest {
    private Animal animal;
    private ApplicationContext ctx;
    
    public AnimalListTest() {
    }
    
    @Before
    public void setUp() {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        animal = (Animal)ctx.getBean("out");
    }
    
    @After
    public void tearDown() {
                
    }
    @Test
    public void testList()
    {
        Set<String> keys = animal.loadGroup().keySet();
        
        
        Assert.assertEquals(3, keys.size());;
        
    }
}
