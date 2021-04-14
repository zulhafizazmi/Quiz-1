package BicycleSetGetScanner;

public class Main {

	public static void main(String[] args) {

		Bicycle MountainBike = new Bicycle();
		
		MountainBike.setBrand();
		MountainBike.setType();
		MountainBike.setColour();
		MountainBike.setWeight();
		
		System.out.println("Brand: " + MountainBike.getBrand());
		System.out.println("Type: " + MountainBike.getType());
		System.out.println("Colour: " + MountainBike.getColour());
		System.out.println("Weight: " + MountainBike.getWeight() + "kg");
		
		
		Bicycle ElectricBike = new Bicycle();
		
		ElectricBike.setBrand();
		ElectricBike.setType();
		ElectricBike.setColour();
		ElectricBike.setWeight();
		
		System.out.println("Brand: " + ElectricBike.getBrand());
		System.out.println("Type: " + ElectricBike.getType());
		System.out.println("Colour: " + ElectricBike.getColour());
		System.out.println("Weight: " + ElectricBike.getWeight() + "kg");

	}

}
