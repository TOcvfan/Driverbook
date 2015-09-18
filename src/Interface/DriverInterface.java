/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import com.sun.javafx.sg.prism.NGTriangleMesh;

/**
 *
 * @author TOcvfan
 */
public interface DriverInterface {
      
    public double kmPerLiter(int distance, double liter);
    
    public double totalPrice(double liter, double pricePerLiter);
    
    public double pricePerLiterDk(double pricePerLiter);
    
    public double ferryBrige(double price);
    
    public void currency(String valuta);
    
    public void driverChange(double distance, String name, String country, String city);
    
    public void newFuel(String name, String country, String city, double liter);
    
    public void economy(String name, String type, String country, String city);
    
    public String time(String startTime, String endTime);
    
    public void saveDistanceFuel(int distance);
    
    public void saveDistanceDriver(double distance);
    
    public void saveEconomy();
    
    public void loadEconomy();
    
    public void saveKmPerL();
    
    public double [] loadKmPerL();
    
    public void saveDriver();
    
    public void loadDriver();
    
    public void saveFuel();
    
    public void loadFuel();

    
}
