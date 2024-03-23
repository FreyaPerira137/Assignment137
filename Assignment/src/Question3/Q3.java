package Question3;

public class Q3 {
	
	// java program to display the fibonacci series
	
	public static void displayFib(int n) {
		int no1 = 0, no2 = 1;
		System.out.print("Fibonacci Series up to "+n+": ");
		while (no1 <= n) {
			System.out.println(no1 + " ");
			int sum = no1 + no2;
			no1 = no2;
			no2 = sum;
		}
		System.out.println();
	}
	
	
	

}
