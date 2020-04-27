package JavaPart2Concepts;

public class MainTest {

	public static void main(String[] args) {
	
		BMW b = new BMW(); //compile time polymorphism
        b.start();
        b.stop();
        b.airbags();
        b.refuel();
        b.gear();
        b.theftsafety();
        b.engine();
        b.wheels();
        b.seats();
        
        Car c = new Car();
        	c.start();
        	c.stop();
        	c.gear();
        	c.refuel();
        	c.engine();
        	c.wheels();
        	c.seats();
        	
        	Car c1 = new BMW(); //run time polymorphism
        	c1.start();
        	c1.stop();
        	c1.refuel();
        	c1.gear();
        	c1.wheels();
        	c1.seats();
        	c1.engine();
        }
        
	}
