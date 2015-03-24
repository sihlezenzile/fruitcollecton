/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.farmcollection.Imp;
import com.zenzile.farmcollection.Vegetable;
import java.util.*;
/**
 *
 * @author SIHLE
 */
public class VegetableImpl implements Vegetable{
    
    private List<String> list;
    private Set<String> set;

    public boolean isEmpt(List<String> l)
    {
        if(l.isEmpty())
            return false;
        return true;
    }
    
    @Override
    public void loadSetItemtype(List<String> list)
    {
        set = new HashSet<>(list);
    }
    
    @Override
    public Set getSetItem()
    {
        return set;
    }
    
    @Override
    public void addItem(String it)
    {
        list = new ArrayList<>();
        list.add(it);
    }
    @Override
    public List getItemList()
    {
        
        List<String> tmp = new ArrayList<>();
        for(String s: set)
        {
            tmp.add(s);
        }
        
        return tmp;
    }
}
