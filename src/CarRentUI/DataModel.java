/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRentUI;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.*;

/**
 *
 * @author divyansh
 */
public class DataModel {

    private ArrayList<Car> availableList;
    private ArrayList<Car> rentedList;
    private ArrayList<Car> repairList;

    public DataModel() {
        try {
            FileInputStream fis = new FileInputStream("model.data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            availableList = (ArrayList<Car>) ois.readObject();
            rentedList = (ArrayList<Car>) ois.readObject();
            repairList = (ArrayList<Car>) ois.readObject();
            System.out.println("Data successfully loaded");

            ois.close();
            fis.close();
            
            return;
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        } catch (FileNotFoundException e) {
            System.out.println("Could not find any previous data");
        } catch (IOException e) {
            System.out.println("Read or write failed!");
        }
        availableList = new ArrayList<Car>();
        rentedList = new ArrayList<Car>();
        repairList = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        car.setIndex(availableList.size() + 1);
        availableList.add(car);
        saveChanges();
    }

    public ArrayList<Car> getAvailableList() {
        return availableList;
    }

    public ArrayList<Car> getRentedList() {
        return rentedList;
    }

    public ArrayList<Car> getRepairList() {
        return repairList;
    }

    public void saveChanges() {
        try {
            FileOutputStream fos = new FileOutputStream("model.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(availableList);
            oos.writeObject(rentedList);
            oos.writeObject(repairList);

            oos.close();
            fos.close();
        } catch (InvalidClassException e) {
            System.out.println("Invalid class!");
        } catch (NotSerializableException e) {
            System.out.println("Not serializable");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }

    }
}
