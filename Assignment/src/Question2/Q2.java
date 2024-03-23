package Question2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//java program to find the factorial of a number
		
		int i=1,fact=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no1 = scan.nextInt();
		while(i<=no1) {
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of the number is: " +fact);
	}

}
