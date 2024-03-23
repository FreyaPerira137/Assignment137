package Question6;

public class Q6 {

	/*Write a Java program to create a class called "Person" with a 
	name and age attribute. Create two instances of the "Person" 
	class, set their attributes using the method, and print their name 
	and age.*/
	
	String name;
	int age;
	
	public Q6 (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
