/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author TOcvfan
 */
public class Distance {
    int distanceFuel;
    double distanceDriver;

    public Distance() {
    }

    public Distance(int distanceFuel) {
	this.distanceFuel = distanceFuel;
    }

    public Distance(double distanceDriver) {
	this.distanceDriver = distanceDriver;
    }

    public Distance(int distanceFuel, double distanceDriver) {
	this.distanceFuel = distanceFuel;
	this.distanceDriver = distanceDriver;
    }

    public int getDistanceFuel() {
	return distanceFuel;
    }

    public void setDistanceFuel(int distanceFuel) {
	this.distanceFuel = distanceFuel;
    }

    public double getDistanceDriver() {
	//System.out.println("getter for afstand driver: " + distanceDriver);
	return distanceDriver;
    }

    public void setDistanceDriver(double distanceDriver) {
	//System.out.println("setter for afstand driver: " + distanceDriver);
	this.distanceDriver = distanceDriver;
    }
    
}
