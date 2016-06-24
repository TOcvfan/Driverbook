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
public class Fuel {
    double distance;
    double liter;
    double pricePerLiter;
    double rate;
    String name;
    String country;
    String city;

    public Fuel(double distance, double liter, double pricePerLiter, String name, String country, String city) {
	this.distance = distance;
	this.liter = liter;
	this.pricePerLiter = pricePerLiter;
	this.name = name;
	this.country = country;
	this.city = city;
    }

    public Fuel(double distance) {
	this.distance = distance;
    }

    public String getCountry() {
	//System.out.println("constructor land: "+country);
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public String getCity() {
	//System.out.println("constructor by: "+city);
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getName() {
	//System.out.println("constructor navn: "+name);
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    

    public Fuel(double distance, double liter, double pricePerLiter, double rate) {
	this.distance = distance;
	this.liter = liter;
	this.pricePerLiter = pricePerLiter;
	this.rate = rate;
    }

    public Fuel() {
    }

    public Fuel(double liter, double pricePerLiter, double rate) {
	this.liter = liter;
	this.pricePerLiter = pricePerLiter;
	this.rate = rate;
    }

    public Fuel(double distance, double liter) {
	this.distance = distance;
	this.liter = liter;
    }

    public double getDistance() {
	return distance;
    }

    public void setDistance(double distance) {
	this.distance = distance;
    }

    public double getLiter() {
	//System.out.println("constructor liter: "+liter);
	return liter;
    }

    public void setLiter(double liter) {
	this.liter = liter;
    }

    public double getPricePerLiter() {
	return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
	this.pricePerLiter = pricePerLiter;
    }

    public double getRate() {
	//System.out.println("construktor getrate :" + rate);
	return rate;
    }

    public void setRate(double rate) {
	//System.out.println("construktor setrate :" + rate);
	this.rate = rate;
    }
}
