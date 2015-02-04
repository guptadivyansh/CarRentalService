/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRentUI;

import java.io.Serializable;

/**
 *
 * @author divyansh
 */
public enum CarType implements Serializable{
    AMBASSADOR(10),
    SUMO(12),
    OMNI(15),
    ESTEEM(15),
    ARMADA(20);
    
    private double rate;
    
    public double getRate() {
        return rate;
    }
    
    CarType(double rate) {
        this.rate = rate;
    }
}
