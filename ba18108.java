package baekjoon;

import java.util.Scanner;

public class ba18108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bool = sc.nextInt();
		int year = 543;
		if (1000 <= bool && bool <= 3000 ) {
			bool -= year;
		}
		System.out.println(bool);
	}
}
