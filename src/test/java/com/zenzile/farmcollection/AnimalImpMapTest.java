/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.farmcollection;

import com.zenzile.farmcollection.config.AppConfig;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author 211282278
 */
public class AnimalImpMapTest {
    
    private Animal animal;
    private ApplicationContext ctx;
    
    public AnimalImpMapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        animal = (Animal)ctx.getBean("farm");
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testMap()
    {
        Assert.assertEquals(animal.findGroup("100-199"), "IN'n'OUT");
        Assert.assertEquals(animal.findGroup("200-299"), "OUTDOOR");
        Assert.assertEquals(animal.findGroup("00-99"), "INDOOR");
                //animal.findGroup("100-199");
    }
    @Test
    public void testNul()
    {
        Assert.assertNotNull(animal.loadGroup());
                //animal.findGroup("100-199");
    }
    
}
