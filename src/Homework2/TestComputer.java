package Homework2;

public class TestComputer {

	public static void main(String[] args) {
		
		Computer c1 = new Computer("16GB", 1, true, 1299.99);
		Computer.User = "Tony";
		Computer.Age = 45;
		c1.ComputerMemory();
		c1.ComputerOperatingSystem();
		Computer.computerBasicinfo();
		c1.ComputerConfigaration();
		
		Computer c2 = new Computer(false, 995.50);
		Computer.User = "Blair";
		Computer.Age = 47;
		Computer.computerBasicinfo();
		c2.ComputerConfigaration();
		
	}

}
