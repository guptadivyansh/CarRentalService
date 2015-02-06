/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRentUI;

import java.util.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author divyansh
 */
public class AvailableTableModel extends AbstractTableModel {

    final private static int COLUMN_NO = 0;
    final private static int COLUMN_TYPE = 1;
    final private static int COLUMN_AC = 2;
    final private static int COLUMN_REG = 3;
    final private static int COLUMN_RATE_DISTANCE = 4;
    final private static int COLUMN_RATE_TIME = 5;

    private String[] columnNames = {"No.", "Type", "AC", "Registration No.", "Rs/km", "Rs/hr"};
    private ArrayList<Car> availableList;

    public AvailableTableModel(ArrayList<Car> availableList) {
        this.availableList = availableList;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return availableList.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case COLUMN_NO:
                return Integer.class;
            case COLUMN_TYPE:
                return CarType.class;
            case COLUMN_AC:
                return Boolean.class;
            case COLUMN_REG:
                return String.class;
            case COLUMN_RATE_DISTANCE:
                return Double.class;
            case COLUMN_RATE_TIME:
                return Double.class;
            default:
                throw new IllegalArgumentException("Invalid column index");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Car car = availableList.get(rowIndex);

        switch (columnIndex) {
            case COLUMN_NO:
                return car.getIndex();
            case COLUMN_TYPE:
                return car.getType();
            case COLUMN_AC:
                return car.isAC();
            case COLUMN_REG:
                return car.getRegistrationNo();
            case COLUMN_RATE_DISTANCE:
                return car.getRateDistance();
            case COLUMN_RATE_TIME:
                return car.getRateTime();
            default:
                throw new IllegalArgumentException("Invalid column index");
        }
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
    }
}
