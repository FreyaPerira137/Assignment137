package Question4;

public class Q4 {

	//java program to count number of digits in an integer
	
	public static int countNo(int n) {
		int count = 0;
		while (n != 0) {
			n/=10;
			count++;
		}
		return count;
	}
}
