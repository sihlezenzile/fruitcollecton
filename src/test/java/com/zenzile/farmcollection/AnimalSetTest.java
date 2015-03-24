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
import java.util.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author SIHLE
 */
public class AnimalSetTest {
    
    private ApplicationContext ctx;
    private Vegetable vege;
    
    public AnimalSetTest() {
    }
    
    @Before
    public void setUp() {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        vege = (Vegetable)ctx.getBean("setvege");
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void test()
    {
        
        vege.addItem("Carrot");
        vege.addItem("Pumkin");
        vege.addItem("Onion");
        
        
        Assert.assertNull(vege.getSetItem());
        
    }
    @Test
    public void testNotNullList()
    {
        List<String> tmp = new ArrayList<>();
        
        tmp.add("Potato");
        tmp.add("Butternut");
        tmp.add("Tomato");
        
        vege.loadSetItemtype(tmp);
        
        Assert.assertNotNull(vege.getItemList());
    }
    @Test
    public void testDentity()
    {
        
    }
}
