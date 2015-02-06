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
    AMBASSADOR(10, 100),
    SUMO(12, 120) ,
    OMNI(15, 150),
    ESTEEM(15, 150),
    ARMADA(20, 200);
    
    private double rateDistance;
    private double rateTime;
    
    public double getRateDistance() {
        return rateDistance;
    }
    
    public void setRateDistance(double rateDistance) {
        this.rateDistance = rateDistance;
    }
    
    public double getRateTime() {
        return rateTime;
    }
    
    public void setRateTime(double rateTime) {
        this.rateTime = rateTime;
    }
    
    CarType(double rateDistance, double rateTime) {
        this.rateDistance = rateDistance;
        this.rateTime = rateTime;
    }
}
