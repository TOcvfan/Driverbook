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
    double distance;
    double drivenDistance;

    public double getDrivenDistance() {
        return drivenDistance;
    }

    public void setDrivenDistance(double drivenDistance) {
        this.drivenDistance = drivenDistance;
    }

    public Distance() {
    }

    public Distance(double distance) {
	this.distance = distance;
    }

    public double getDistance() {
	//System.out.println("getter for afstand driver: " + distanceDriver);
	return distance;
    }

    public void setDistance(double distance) {
	//System.out.println("setter for afstand driver: " + distanceDriver);
	this.distance = distance;
    }
    
}
