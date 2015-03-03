/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.vegstoretdd;

import com.zenzile.vegstoretdd.Imp.VegetableImp;
import com.zenzile.vegstoretdd.config.AppConfig;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author bakhe
 * 
 */
public class OrderVegetableTest {

    private VegetableStore vegetable;
    private ApplicationContext ctx;
    public OrderVegetableTest() {
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
        vegetable = (VegetableStore)ctx.getBean("retvegstore");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testOrder()
    {
        vegetable = new VegetableImp();
        
        vegetable.orderVegetable("B01", "Cabbage");
        //vegetable.orderVegetable("B02", "Carrot");
        
        Assert.assertTrue(vegetable.orderVegetable("B02", "Carrot"));
        
        
    }
}
