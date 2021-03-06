/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Drivers;
import com.sun.javafx.sg.prism.NGTriangleMesh;
import java.util.ArrayList;

/**
 *
 * @author TOcvfan
 */
public interface DriverInterface {
    //rayList<Drivers> driverList = new ArrayList<Drivers>();
      
    public double kmPerLiter(String type, double distance, double liter);
    
    public double totalPriceDK(String type, double price);
    
    public double pricePerLiterDK(double liter, double price);
    
    public double loadPrice(String type);
    
    public double ferryBrige(double price);
    
    public void currency(String valuta);
    
    public void driverChange(String type, double distance, String name, String country, String city);
    
    public void newFuel(String name, String country, String city, double liter);
    
    public void economy(String name, String type, String country, String city);
    
    public String time(String startTime, String endTime);
    
    public void saveDistance(String type, double distance);
    
    public double loadDrivenDis();
    
    public void saveEconomy();
    
    public void loadEconomy();
    
    public void saveKmPerL();
    
    public double loadKmPerL();
    
    public void saveDriver();
    
    public String[] loadDriver();
    
    public void saveFuel();
    
    public void loadFuel();

    
}
