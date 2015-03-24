/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.farmcollection.Imp;

import com.zenzile.farmcollection.Animal;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 211282278
 */
public class AnimalImp implements Animal{
    
    @Override
    public Map loadGroup()
    {
        Map<String, String> group = new HashMap<>();
        group.put("00-99", "INDOOR");
        group.put("100-199", "IN'n'OUT");
        group.put("200-299", "OUTDOOR");
        group.put("300-500", "FIELD");
        
        return group;
    }

    @Override
    public String findGroup(String kg) {
        
        Map<String, String> gmap = loadGroup();
        
        String value = gmap.get(kg);
        
        return value;
    }
    public boolean checkAdded()
    {
        return loadGroup().isEmpty();
    }

}
