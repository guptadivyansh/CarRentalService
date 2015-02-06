/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRentUI;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author divyansh
 */
public class Car implements Serializable{

    private String registrationNo;
    private Integer odoReading;
    private boolean AC;
    private CarType type;
    private boolean rented;
    private String rentName;
    private String rentPhoneNo;
    private Date rentDate;
    private Date expectedReturn;
    private Date rentedOn;
    private Double advance;
    private Boolean inWorkshop;
    private Date repairDate;    
    private Integer index;
    private Double rateDistance;
    private Double rateTime;
    private Double totalRepairCosts;
    private Double totalRevenue;
    private Integer totalDistance;
    private Integer totalFuel;
    
    public Car(String regNo, int odoReading, boolean AC, CarType type) {
        this.registrationNo = regNo;
        this.odoReading = odoReading;
        this.AC = AC;
        this.type = type;
        if(AC) {
            this.rateDistance = 1.5 * type.getRateDistance();
            this.rateTime = 1.5 * type.getRateTime();
        }
        else {
            this.rateDistance = type.getRateDistance();
            this.rateTime = type.getRateTime();
        }
        this.totalDistance = 0;
        this.totalFuel = 0;
        this.totalRepairCosts = 0.0;
        this.totalRevenue = 0.0; 
        this.rented = false;
        this.inWorkshop = false;       
    }
    
    public double calculateCost(int distance) {
        Date returnDate = new Date();
        long t1 = returnDate.getTime();
        long t2 = rentDate.getTime();
        long diff = t2 - t1;
        diff /= 3600000;
        if(diff < 4) diff = 4;
        double cost = diff * rateTime;
        if(distance * rateDistance > cost) cost = distance * rateDistance;
        return cost;
    }
    
    public void addRevenue(int distance) {
        double cost = calculateCost(distance);
        totalRevenue += cost;
    }
      
    public Integer getTotalFuel() {
        return totalFuel;
    }
    
    public void addFuel(int fuel) {
        totalFuel += fuel;
    }
    
    public Integer getTotalDistance() {
        return totalDistance;
    }
    
    public void addDistance(int distance) {
        totalDistance += distance;
        odoReading += distance;
    }
    
    public Double getRateTime() {
        return rateTime;
    }
    
    public void setRateTime(Double rateTime) {
        this.rateTime = rateTime;
    }
    
    public Double getRateDistance() {
        return rateDistance;
    }
    
    public void setRateDistance(Double rateDistance) {
        this.rateDistance = rateDistance;
    }
    
    public Integer getIndex() {
        return index;
    }
    
    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public Integer getOdoReading() {
        return odoReading;
    }

    public void setOdoReading(Integer odoReading) {
        this.odoReading = odoReading;
    }

    public Boolean isAC() {
        return AC;
    }

    public void setAC(Boolean aC) {
        AC = aC;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public String getRentName() {
        return rentName;
    }

    public void setRentName(String rentName) {
        this.rentName = rentName;
    }

    public String getRentPhoneNo() {
        return rentPhoneNo;
    }

    public void setRentPhoneNo(String rentPhoneNo) {
        this.rentPhoneNo = rentPhoneNo;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getExpectedReturn() {
        return expectedReturn;
    }

    public void setExpectedReturn(Date expectedReturn) {
        this.expectedReturn = expectedReturn;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public boolean isInWorkshop() {
        return inWorkshop;
    }

    public void setInWorkshop(boolean inWorkshop) {
        this.inWorkshop = inWorkshop;
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public double getTotalRepairCosts() {
        return totalRepairCosts;
    }

    public void addRepairCost(double cost) {
        totalRepairCosts += cost;
    }
    
    public double getTotalRevenue() {
        return totalRevenue;
    }

}
