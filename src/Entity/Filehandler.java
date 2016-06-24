/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TOcvfan
 */
public class Filehandler {

    Drivers d = new Drivers();
    Fuel f = new Fuel();
    Economy e = new Economy();
    KmPerLiter k = new KmPerLiter();
    private Scanner sc;
    Double kilometerPerLiter;
    String fueling;
    String change;
    String newEconomy;
    int newDistanceFuel;
    double newDistanceDriver;
    public static ArrayList<KmPerLiter> kmPerL = new ArrayList<KmPerLiter>();
    public static ArrayList<Fuel> fuelList = new ArrayList<Fuel>();
    public static ArrayList<Drivers> driverList = new ArrayList<Drivers>();
    public static ArrayList<Economy> moneyList = new ArrayList<Economy>();
    public static ArrayList<Distance> distanceList = new ArrayList<Distance>();

//---------------------------------------------------------------------------------------------------------------------------
    public void addDriver(Drivers driver) {
	driverList.add(driver);
	//System.out.println("filehandler add driver: " + driver);
    }

    public void addKmPerL(KmPerLiter km) {

	kmPerL.add(km);
	//System.out.println("filehandler add km: " + km);
    }

    public void addFuel(Fuel fuel) {
	fuelList.add(fuel);
	//System.out.println("filehandler add fuel: " + fuel);
    }

    public void addDistance(Distance dist) {
	distanceList.add(dist);
	//System.out.println("filehandler add distance: " + dist);
    }

    public void addEconomy(Economy economy) {
	moneyList.add(economy);
	//System.out.println("filehandler add money: " + economy);
    }

    public void saveKmPerL() {

	try {
	    File file = new File("kmPerL.txt");
	    String kmL = "";

	    if (!file.exists()) {
		file.createNewFile();
	    }

	    for (int i = 0; i < kmPerL.size(); i++) {

		kmL = "" + kmPerL.get(i).getKmPerLiter();
	    }
	    FileWriter fw = new FileWriter(file, true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.newLine();
	    bw.write(kmL);
	    bw.close();

	    //System.out.println("Done: " + kmL);

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static double[] loadKmPerL() throws IOException {

	Scanner sc = new Scanner(new File("kmPerL.txt"));
	ArrayList<Double> arr = new ArrayList<>();
	while (sc.hasNext()) {
	    arr.add(sc.nextDouble());
	}
	double doubleArr[] = new double[arr.size()];
	for (int i = 0; i < arr.size(); i++) {
	    doubleArr[i] = arr.get(i);
	}
	return doubleArr;
    }

    public void saveDriver() {

	try {

	    File file = new File("driver.txt");
	    String drive = "";
	    // if file doesnt exists, then create it
	    if (!file.exists()) {
		file.createNewFile();
	    }
	    for (int i = 0; i < driverList.size(); i++) {
		drive = driverList.get(i).getName() + " " + driverList.get(i).getDistance()
			+ " " + driverList.get(i).getCountry() + " " + driverList.get(i).getCity() + " " + driverList.get(i).getTime();
	    }
	    FileWriter fw = new FileWriter(file, true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.newLine();
	    bw.write(drive);
	    bw.close();

	    //System.out.println("Done: " + drive);
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    public void loadDriver() {

	try {
	    sc = new Scanner(new File("driver.txt"));
	} catch (Exception e) {
	    System.out.println("Could not locate file");
	}

	while (sc.hasNext()) {

	    String name = sc.next();
	    int distance = Integer.parseInt(sc.next());
	    String time = sc.next();
	    String country = sc.next();
	    String city = sc.next();

	    Drivers dr = new Drivers(name, distance, time, country, city);
	    driverList.add(dr);

	    change += name + " " + distance + " " + time + " " + country + " " + city + "\n";
	    change.trim();

	}

    }

    public void saveFuel() {

	try {
	    File file = new File("fuel.txt");
	    String moreFuel = "";
	    if (!file.exists()) {
		file.createNewFile();
	    }

	    for (int i = 0; i < fuelList.size(); i++) {

		moreFuel = fuelList.get(i).getName() + " " + fuelList.get(i).getDistance() + " "
			+ fuelList.get(i).getLiter() + " " + fuelList.get(i).getPricePerLiter() + " "
			+ fuelList.get(i).getCountry() + " " + fuelList.get(i).getCity();

	    }
	    FileWriter fw = new FileWriter(file, true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.newLine();
	    bw.write(moreFuel);
	    bw.close();

	    //System.out.println("Done: " + moreFuel);

	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    public void loadFuel() {

	try {
	    sc = new Scanner(new File("Fuel.txt"));
	} catch (Exception e) {
	    System.out.println("Could not locate file");
	}

	while (sc.hasNext()) {

	    int distance = Integer.parseInt(sc.next());
	    double liter = Double.parseDouble(sc.next());
	    double pricePerLiter = Double.parseDouble(sc.next());

	    String name = sc.next();
	    String country = sc.next();
	    String city = sc.next();

	    Fuel fu = new Fuel(distance, liter, pricePerLiter, name, country, city);
	    fuelList.add(fu);

	    //System.out.println("readfile: " + name + " " + money + "\n");
	    fueling += distance + " " + liter + " " + pricePerLiter + " " + name + " "
		    + country + " " + city + "\n";
	    fueling.trim();
	    //System.out.println(kilometerPerLiter.trim());
	}

    }

    public void saveDistanceFuel() {
	try {

	    File file = new File("distanceFuel.txt");
	    String distanceFuel = "";
	    // if file doesnt exists, then create it
	    if (!file.exists()) {
		file.createNewFile();
	    }
	    for (int i = 0; i < distanceList.size(); i++) {
		distanceFuel = "" + distanceList.get(i).getDistanceFuel();
	    }
	    FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write(distanceFuel);
	    bw.close();

	    //System.out.println("Done: " + distanceFuel);

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public int loadDistanceFuel() {
	try {
	    sc = new Scanner(new File("distanceFuel.txt"));
	} catch (Exception e) {
	    System.out.println("Could not locate file");
	}

	while (sc.hasNext()) {

	    int distancefuel = Integer.parseInt(sc.next());

	    Distance fu = new Distance(distancefuel);
	    distanceList.add(fu);

	    newDistanceFuel += distancefuel;

	}
	return newDistanceFuel;
    }

    public void saveEconomy() {
	try {
	    File file = new File("economy.txt");
	    String money = "";
	    if (!file.exists()) {
		file.createNewFile();
	    }

	    for (int i = 0; i < moneyList.size(); i++) {

		money = moneyList.get(i).getName() + " " + moneyList.get(i).getPrice() + " " + moneyList.get(i).getType()
			+ " " + moneyList.get(i).getCountry() + " " + moneyList.get(i).getCity();
	    }

	    FileWriter fw = new FileWriter(file, true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.newLine();
	    bw.write(money);
	    bw.close();

	    //System.out.println("Done: " + money);

	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    public void loadEconomy() {

	try {
	    sc = new Scanner(new File("economy.txt"));
	} catch (Exception e) {
	    System.out.println("Could not locate file");
	}

	while (sc.hasNext()) {

	    String type = sc.next();
	    double price = Integer.parseInt(sc.next());
	    String name = sc.next();
	    String country = sc.next();
	    String city = sc.next();

	    Economy ec = new Economy(price, name, type, country, city);
	    moneyList.add(ec);

	    //System.out.println("readfile: " + name + " " + money + "\n");
	    newEconomy += name + " " + type + " " + price + " " + country + " " + city + "\n";
	    newEconomy.trim();
	    //System.out.println(kilometerPerLiter.trim());
	}

    }

    public void saveDistanceDriver() {
	try {

	    File file = new File("distanceDriver.txt");
	    String distanceDriver = "";
	    // if file doesnt exists, then create it
	    if (!file.exists()) {
		file.createNewFile();
	    }
	    for (int i = 0; i < distanceList.size(); i++) {
		distanceDriver = "" + distanceList.get(i).getDistanceDriver();
		//System.out.println("loop: " + distanceDriver);
	    }
	    FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write(distanceDriver);
	    bw.close();

	    //System.out.println("Done: " + distanceDriver);

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public double loadDistanceDriver() {
	try {
	    sc = new Scanner(new File("distanceDriver.txt"));
	} catch (Exception e) {
	    System.out.println("Could not locate file");
	}

	while (sc.hasNext()) {

	    double distanceDriver = Double.parseDouble(sc.next());

	    Distance fu = new Distance(distanceDriver);
	    distanceList.add(fu);

	    newDistanceDriver += distanceDriver;

	}
	return newDistanceDriver;
    }
}
