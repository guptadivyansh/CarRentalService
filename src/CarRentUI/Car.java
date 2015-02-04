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
    private Date expectedReturnDate;
    private Double advance;
    private Boolean inWorkshop;
    private Date repairDate;
    private Double totalRepairCosts;
    private Double totalRevenue;
    private Integer index;
    private Double rate;
    
    public Car(String regNo, int odoReading, boolean AC, CarType type) {
        this.registrationNo = regNo;
        this.odoReading = odoReading;
        this.AC = AC;
        this.type = type;
        if(AC) this.rate = 1.5 * type.getRate();
        else this.rate = type.getRate();
    }
    
    public Double getRate() {
        return rate;
    }
    
    public void setRate(Double rate) {
        this.rate = rate;
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

    public Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(Date expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
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

    public void setTotalRepairCosts(double totalRepairCosts) {
        this.totalRepairCosts = totalRepairCosts;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}
