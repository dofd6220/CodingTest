package baekjoon;

import java.util.Scanner;

public class ba2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String B = sc.next();

		sc.close();
		
		System.out.println(A * (B.charAt(2) -('0')));
		System.out.println(A * (B.charAt(1) -('0')));
		System.out.println(A * (B.charAt(0) -('0')));
		System.out.println(A * Integer.parseInt(B));
		
		/*
		 * int A = sc.nextInt(); int B = sc.nextInt();
		 * 
		 * sc.close();
		 * 
		 * int result1 = A * (B % 10); // Multiply A by the last digit of B int result2
		 * = A * ((B / 10) % 10); // Multiply A by the second-to-last digit of B int
		 * result3 = A * (B / 100); // Multiply A by the first digit of B int
		 * finalResult = A * B; // Multiply A by B as a whole
		 * 
		 * System.out.println(result1); System.out.println(result2);
		 * System.out.println(result3); System.out.println(finalResult);
		 */
		}
}
