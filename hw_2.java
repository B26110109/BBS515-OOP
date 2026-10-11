package bbs516;

public class hw_2 {


	    public static void main(String[] args) {

	        int distance = 450;
	        double consumptionPer100Km = 7.5;
	        double fuelPrice = 52;
	        double highwayFee = 250;
	        int numberOfPeople = 3;

	        double totalFuelConsumption =
	                distance * 0.075;

	        double fuelCost =
	                totalFuelConsumption * fuelPrice;

	        double totalTravelCost =
	                fuelCost + highwayFee;

	        double costPerPerson =
	                totalTravelCost / numberOfPeople;

	        System.out.println("Total Fuel Consumption: " + totalFuelConsumption + " liters");
	        System.out.println("Fuel Cost: " + fuelCost + " TL");
	        System.out.println("Total Travel Cost: " + totalTravelCost + " TL");
	        System.out.println("Cost Per Person: " + costPerPerson + " TL");
	    }
	}

