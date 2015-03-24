/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.farmcollection;

import java.util.Map;

/**
 *
 * @author 211282278
 */
public interface Animal {
    
    public String findGroup(String kg);
    public Map loadGroup();

    /**
     *
     * @return
     */
    public boolean checkAdded();
}
