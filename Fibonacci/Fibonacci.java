import java.util.*;

public class Fibonacci {

	private static Scanner sc;

	public static void main(String[] args) {
		int count, n, t1 = 0, t2 = 1, display = 0;
		sc = new Scanner(System.in);

		System.out.print("Enter number of terms you want:");
		n = sc.nextInt();

		/* Displayying first two terms */
		System.out.print("Fibonacci Series:" + t1 + "+" + t2 + "+");
		
		count = 2;
		while (count < n) {
			display = t1 + t2;
			t1 = t2;
			t2 = display;
			++count;
			System.out.printf("%d+", display);
		}


	}
}