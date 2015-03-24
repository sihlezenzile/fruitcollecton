/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.farmcollection.config;

import com.zenzile.farmcollection.Animal;
import com.zenzile.farmcollection.Vegetable;
import com.zenzile.farmcollection.Imp.AnimalImp;
import com.zenzile.farmcollection.Imp.VegetableImpl;
import com.zenzile.farmcollection.Imp.OutdoorAnimal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author 211282278
 */
@Configuration
public class AppConfig {

    @Bean(name="farm")
    public Animal getAnimal()
    {
        return new AnimalImp();
    }
    
    @Bean(name="setvege")
    public Vegetable getVetegatable()
    {
        return new VegetableImpl();
    }
    @Bean(name="out")
    public Animal getOutdoor()
    {
        return new OutdoorAnimal();
    }
}
