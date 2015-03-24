/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.farmcollection.Imp;

import com.zenzile.farmcollection.object.AnimalClass;
import com.zenzile.farmcollection.Animal;
import com.zenzile.farmcollection.object.Farm;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SIHLE
 */
public class OutdoorAnimal implements Animal
{
    
    /**
     *
     * @param ky
     * @return
     */
    private Farm f1;
    private Farm f2;
    private Farm f3;
    
    public void addAnimal()
    {
         f1 = new AnimalClass(220, "Horse");
         f2 = new AnimalClass(444, "Cow");
         f3 = new AnimalClass(160, "Goat");
    }
    @Override
    public String findGroup(String ky)
    {
        return "";
    }
    
    @Override
    public Map loadGroup()
    {
        Map<String, Farm> group = new HashMap<>();

        
        group.put("MEDIUM", f1);
        group.put("LARGE", f2);
        group.put("SMALL", f3);
        
        return group;        
    }
    
    public boolean checkAdded()
    {
        Map mp = loadGroup();
        
        if(mp.isEmpty())
            return false;
        return true;
    }

}
