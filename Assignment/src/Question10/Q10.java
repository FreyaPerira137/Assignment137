package Question10;

/*Create a class 'Student' with three data members which are 
name, age and address. The constructor of the class assigns 
default values name as "unknown", age as '0' and address as "not 
available". It has two methods with the same name 'setInfo'. 
First method has two parameters for name and age and assigns 
the same whereas the second method takes has three parameters 
which are assigned to name, age and address respectively. Print 
the name, age and address of 3 students. */

class Student {
	 private String name;
	 private int age;
	 private String address;
	 
	 // Constructor with default values
	 public Student() {
		 this.name = "unknown";
		 this.age = 0;
		 this.address = "not available";
	 }
	 // Method to set name and age
	 public void setInfo(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 // Method to set name, age, and address
	 public void setInfo(String name, int age, String address) {
		 this.name = name;
		 this.age = age;
		 this.address = address;
	 }
	 // Method to print student information
	 public void printInfo() {
		 System.out.println("Name: " + name);
		 System.out.println("Age: " + age);
		 System.out.println("Address: " + address);
	 }
}


public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Student[] students = new Student[3];
		 students[0] = new Student();
		 students[0].setInfo("Alice", 20);
		 
		 students[1] = new Student();
		 students[1].setInfo("Bob", 22, "Goa");
		 
		 students[2] = new Student();
		 students[2].setInfo("Charlie", 25, "Goa");
		 
		 for (Student student : students) {
			 student.printInfo();
			 System.out.println();
		 }

	}

}
