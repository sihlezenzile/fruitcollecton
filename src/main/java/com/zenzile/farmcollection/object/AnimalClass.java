/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.farmcollection.object;

/**
 *
 * @author 211282278
 */
public class AnimalClass implements Farm{

    private int size;
    private String name;

    public AnimalClass(int size, String name) {
        this.size = size;
        this.name = name;
    }
    
    
    @Override
    public void setName(String nm) {
       name = nm; 
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setSize(int sz) {
        size = sz;
    }

    @Override
    public int getSize() {
        return size;
    }
    
}
