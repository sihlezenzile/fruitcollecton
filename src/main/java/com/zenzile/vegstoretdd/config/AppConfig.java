package com.zenzile.vegstoretdd.config;

import com.zenzile.vegstoretdd.Imp.VegetableImp;
import com.zenzile.vegstoretdd.VegetableStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zenzile on 2015/02/23.
 */
@Configuration
public class AppConfig {
    @Bean(name="retvegstore")
    public VegetableStore getVegetable(){
        return new VegetableImp();
    }

}