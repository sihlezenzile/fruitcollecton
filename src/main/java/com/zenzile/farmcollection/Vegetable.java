/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.farmcollection;

import java.util.List;
import java.util.Set;

/**
 *
 * @author 211282278
 */
public interface Vegetable {
    public void addItem(String vg);
    public Set getSetItem();
    public void loadSetItemtype(List<String> list);
    public List getItemList();
    
}
