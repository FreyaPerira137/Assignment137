package Question8;

public class Q8 {

	/* Write a Java program to create a class called "Employee" with a 
	name, job title, and salary attributes, and methods to calculate 
	and update salary.
	DA=10%basic salary
	HRA=5000
	Total salary=basic salary+DA+HRA */
	
	 String name;
	 String jobTitle;
	 double basicSalary;
	 
	 public Q8(String name, String jobTitle, double basicSalary) {
		 this.name = name;
		 this.jobTitle = jobTitle;
		 this.basicSalary = basicSalary;
	 }
	 
	 public double calculateSalary() {
		 double DA = 0.1 * basicSalary;
		 double HRA = 5000;
		 return basicSalary +DA + HRA;
	 }
	 
	 public void updateBSalary(double newSalary) {
		 this.basicSalary = basicSalary;
	 }
	 
	 public String getName() {
			return name;
	 }
	 
	 public void setName(String name) {
			this.name = name;
	 } 
	 
	 public String jobTitle() {
			return jobTitle;
	 }
	 
	 public void setjobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
	 } 
	 
	 public double basicSalary() {
			return basicSalary;
	 }
	 
	 public void setbasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
	 } 
}
