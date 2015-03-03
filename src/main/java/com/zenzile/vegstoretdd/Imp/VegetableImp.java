/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.vegstoretdd.Imp;

import com.zenzile.vegstoretdd.VegetableStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bakhe
 */
public class VegetableImp implements VegetableStore{
    
    public VegetableImp(
            )
    {
    }

    @Override
    public boolean orderVegetable(String item, String key) {
        Map<String, String> map = new HashMap<>();
        map.put(key, item);
        return !map.isEmpty();
    }

    @Override
    public int countVegetable(List<String> veg) {
        int total = veg.size();
        return total;
    }

    @Override
    public boolean removeVegetable(String veg) {
        
        
        return false;
    }
    
    
}
