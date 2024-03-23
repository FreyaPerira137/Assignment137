package Question9;

/*Write a Java program to create a class called Vehicle with a 
method called drive(). Create a subclass called Car that 
overrides the drive() .The drive method in the car class should 
call the parent drive method also. In the main program create the 
object of the car class and call the drive method.
Add a member to the vehicle class called horsepower and assign 
it to 50.
In the car class also add the horsepower and assign it to 80.
In the vehicle class create a constructor,which has a parameter 
horsepower .
In the car class add another member make
create a constructor for the car class also ,which will call the 
vehicle class constructor .*/

class Vehicle {
	 private int horsepower;
	 public Vehicle(int horsepower) {
		 this.horsepower = horsepower;
	 }
	 public void drive() {
		 System.out.println("Vehicle is being driven.");
	 }
	}
	class Car extends Vehicle {
		 private int carHorsepower;
		 private String make;
		 public Car(int horsepower, int carHorsepower, String make) {
		 super(horsepower);
			 this.carHorsepower = carHorsepower;
			 this.make = make;
		 }
		 @Override
		 public void drive() {
			 super.drive(); // Call the drive method of the parent class (Vehicle)
			 System.out.println("Car is being driven.");
			 System.out.println("Car Horsepower: " + carHorsepower);
			 System.out.println("Car Make: " + make);
		}
	} 
		 


public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car(80, 200, "Toyota");
		myCar.drive();
	}

}
