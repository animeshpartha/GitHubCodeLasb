package Homework2;

public class Computer {

	public static String User;   //static variable
	public static int Age; 
	String RAM;                  //non-static variable
	int HDD; 
	double Price;
	boolean iOS;
	
	
	//static method
	public static void computerBasicinfo() { 
		System.out.println("Basicinfo: "+User+ " "+Age);	
		}
	
	//non-static method No.1
	public void ComputerMemory() {
		System.out.println("ComputerMemory: "+RAM+ ":"+HDD);
	}
	
	//non-static method No.2
	public void ComputerOperatingSystem() {
		System.out.println("ComputerOperatingSystem: "+iOS+ ":"+User);
	}
	
	//Constructor No.1
	public Computer(String RAM, int HDD, boolean iOS, double Price) {
		this.RAM = RAM;
		this.HDD = HDD;
		this.Price = Price;
		this.iOS = iOS;
	}
	
	//Constructor No.2
	public Computer(boolean iOS,double Price) {
		this.iOS = iOS;
		this.Price = Price;
	}
	
	//non-static method No.2
	public void ComputerConfigaration() {
		System.out.println("ComputerConfigaration: "+iOS+" "+Price);
		
	}
	
	
}
