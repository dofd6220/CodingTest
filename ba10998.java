package baekjoon;

import java.util.Scanner;

public class ba10998 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result = 0;
		if(0 < A && B < 10) {
			result = A * B;
		}
		System.out.println(result);
	}
}
