/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.vegstoretdd;

import java.util.List;

/**
 *
 * @author zenzile
 */
public interface VegetableStore {
    boolean orderVegetable(String item, String key);
    int countVegetable(List<String> veg);
    boolean removeVegetable(String veg);
}
