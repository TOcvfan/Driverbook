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
public class Drivers {
    
    String name;
    double distance;
    String time;
    String country;
    String city;

    @Override
    public String toString() {
	return name + " " + distance + " " + country + " " + city;
    }

    public Drivers() {
    }

    public String getName() {
	//System.out.println("getnavn: "+name);
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getDistance() {
	//System.out.println("getafstand: "+distance);
	return distance;
    }

    public void setDistance(double distance) {
	this.distance = distance;
    }

    public Drivers(String name, double distance, String country, String city, String time) {
	this.name = name;
	this.distance = distance;
	this.country = country;
	this.city = city;
	this.time = time;
    }

    public String getTime() {
	//System.out.println("gettid: "+time);
	return time;
    }

    public void setTime(String time) {
	this.time = time;
    }

    public String getCountry() {
	//System.out.println("getland: "+country);
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
	
    }

    public String getCity() {
	//System.out.println("getby: "+city);
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    
}
