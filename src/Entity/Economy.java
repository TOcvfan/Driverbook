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
public class Economy {
    double price;
    String name;
    String type;
    String country;
    String city;

    public Economy(double price, String name, String type, String country, String city) {
	this.price = price;
	this.name = name;
	this.type = type;
	this.country = country;
	this.city = city;
    }

    public Economy() {
    }
    
    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }
    
    
}
