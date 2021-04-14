package BicycleSetGetScanner;
import java.util,*; //import util package that including Scanner class

public class Bicycle {
	private String brand;
	private String type;
	private String colour;
	private double weight;
	
	Scanner s = new Scanner(System.in);

	// Create Setter Method
	
	void setBrand() {
		
		System.out.println("Enter Brand");
		this.brand = s.nextline();
	    }
	
	void setType() {
		
		System.out.println("Enter Type");
		this.type = s.nextline();
	    }
	
	void setColour() {
		
		System.out.println("Enter Colour");
		this.colour = s.nextline();
	    }
	
	void setWeight() {
		
		System.out.println("Enter Weight");
		this.weight = s.nextdouble();
	    }
	
	
	
	// Create Getter Method
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public double getWeight() {
		return this.weight;
	}
		
}
