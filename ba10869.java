package baekjoon;

import java.util.Scanner;

public class ba10869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(1 <= A && B <= 10000) {
			System.out.printf("%d\n", A + B);
			System.out.printf("%d\n", A - B);
			System.out.printf("%d\n", A * B);
			System.out.printf("%d\n", A / B);
			System.out.printf("%d\n", A % B);
		}
	}
}
