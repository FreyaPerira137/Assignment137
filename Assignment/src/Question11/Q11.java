package Question11;
/*Write a Java program to create a class called Teachers 
with member ‘type’, a method called Teaches(). Create a 
subclass called teacherTeaches that has new member ‘name’ 
method Subjects () . in the main class method to print "The 
teacher is teaching ________ " by making the user enter the 
subject. */

import java.util.Scanner;

class Teachers {
	 String type;
	 public Teachers(String type) {
		 this.type = type;
	 }
	 public void Teaches() {
		 System.out.println("Teacher type: " + type);
	 }

}
class TeacherTeaches extends Teachers {
	String name;
	public TeacherTeaches(String type, String name) {
		 super(type);
		 this.name = name;
	 }
	 public void Subjects(String subject) {
		 System.out.println("The teacher is teaching " + subject);
	 }
}


public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the teacher's type: ");
		 String teacherType = scanner.nextLine();
		 
		 System.out.print("Enter the teacher's name: ");
		 String teacherName = scanner.nextLine();
		 
		 TeacherTeaches teacher = new TeacherTeaches(teacherType, teacherName);
		 
		 System.out.print("Enter the subject the teacher is teaching: ");
		 String subject = scanner.nextLine();
		 
		 teacher.Teaches();
		 teacher.Subjects(subject);
	}

}
