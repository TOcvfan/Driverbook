/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Distance;
import Entity.Drivers;
import Entity.Economy;
import Entity.Filehandler;
import Entity.Fuel;
import Entity.KmPerLiter;
import Interface.DriverInterface;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author TOcvfan
 */
public class Control implements DriverInterface{
    
    Drivers d;
    Fuel f;
    Filehandler fh;
    Economy e;
    KmPerLiter k;
    Distance dis;
    
    public Control(){
	d = new Drivers();
	f = new Fuel();
	fh = new Filehandler();
	e = new Economy();
	k = new KmPerLiter();
	dis = new Distance();
	
    }
    @Override
    public double drivenDistance(String type, double distance){
        double distance1 = 0;
        distance1 = fh.loadDistance(type);
        
	double distance2 = distance;
        double drivenDistance = distance2 - distance1;
        
        System.out.println("beregnet: " + drivenDistance);
        return drivenDistance;
    }

    @Override
    public double kmPerLiter(String type, double distance, double liter) {
	double drivenDistance = drivenDistance(type, distance);
	
	double kmPerLiter = drivenDistance/liter;
        System.out.println("liter: " + liter);
	k.setKmPerLiter(kmPerLiter);
        f.setDistance(drivenDistance);
	fh.addFuel(f);
	fh.addKmPerL(k);
	return kmPerLiter;
    }
    
    @Override
    public double getDistance(){
        double km = f.getDistance();
        System.out.println(km);
        return km;
    }
    
    @Override
    public void saveDistance(String type, double distance){
	dis.setDistance(distance);
	fh.addDistance(dis);
	fh.saveDistance(type);
    }

    @Override
    public double totalPrice(double liter, double pricePerLiter) {
	double rate = f.getRate();
	//System.out.println(rate);
	double price = liter * pricePerLiter * rate;
	e.setPrice(price);
	//System.out.println("metode totalpris " + price);
	fh.addEconomy(e);
	return price;
    }

    @Override
    public double pricePerLiterDk(double pricePerLiter) {
	double rate = f.getRate();
	double pricePerLiterDk = pricePerLiter * rate;
	f.setPricePerLiter(pricePerLiterDk);
	fh.addFuel(f);
	return pricePerLiterDk;
	
    }

    @Override
    public double ferryBrige(double price) {
	double rate = f.getRate();
	double ferryBrige = price * rate;
	e.setPrice(ferryBrige);
	fh.addEconomy(e);
	return ferryBrige;
	
    }

    @Override
    public void currency(String valuta) {
	double Czech = 0.27;
	double Euro = 7.46;
	double Swiss = 7.16;
	double Kroner = 1;
	
	if(valuta.equals("Koruna")){
	    f.setRate(Czech);
	}
	
	if(valuta.equals("Euro")){
	    f.setRate(Euro);
	}
	
	if(valuta.equals("Swiss")){
	    f.setRate(Swiss);
	}
	
	if(valuta.equals("Kroner")){
	    f.setRate(Kroner);
	}
    }

    @Override
    public void driverChange(String type, double distance, String name, String country, String city) {
	double drivenDistance = drivenDistance(type, distance);
	d.setName(name);
	d.setDistance(drivenDistance);
	//d.setTime(time);
	d.setCountry(country);
	d.setCity(city);
	fh.addDriver(d);
	
    }

    @Override
    public void newFuel(String name, String country, String city, double liter) {
	f.setLiter(liter);
	f.setName(name);
	f.setCountry(country);
	f.setCity(city);
	//System.out.println("Metode newFuel: " +name +" "+ liter +" "+ country +" "+ city);
	fh.addFuel(f);
    }

    @Override
    public String time(String startTime, String endTime) {
	String time1 = startTime;
	String time2 = endTime;
	
	SimpleDateFormat format = new SimpleDateFormat("HH:mm");
	String time = null;
	Date d1 = null;
	Date d2 = null;
	try {
		d1 = format.parse(time1);
		d2 = format.parse(time2);
 
		long diff = d2.getTime() - d1.getTime();
		
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		time = (diffHours + ":" + diffMinutes);
		  // System.out.println("Metode tid: "+diffHours+":"+diffMinutes);
		d.setTime(time);
		 //  System.out.println("efter add tid: " + d);
		   fh.addDriver(d);
 
	} catch (Exception e) {
		e.printStackTrace();
	}
	return time;
    }

    @Override
    public void saveKmPerL() {
	fh.saveKmPerL();
    }

    @Override
    public double loadKmPerL() {
	double km = fh.loadKmPerL();
	return km;
        
    }

    @Override
    public void saveDriver() {
	//System.out.println("hertil måske???");
	fh.saveDriver();
    }

    @Override
    public void loadDriver() {
	
	fh.loadDriver();
    }

    @Override
    public void saveFuel() {
	fh.saveFuel();
    }

    @Override
    public void loadFuel() {
	fh.loadFuel();
    }

    @Override
    public void economy(String name, String type, String country, String city) {
	e.setName(name);
	e.setType(type);
	e.setCountry(country);
	e.setCity(city);
	fh.addEconomy(e);
	
    }

    

    @Override
    public void saveEconomy() {
	fh.saveEconomy();
    }

    @Override
    public void loadEconomy() {
	fh.loadEconomy();
    }

    

   
    
}
