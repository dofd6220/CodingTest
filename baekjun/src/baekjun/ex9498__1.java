package baekjun;

import java.util.Scanner;

public class ex9498__1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		sc.close();
		
		switch (score / 10) {
		case 10 : System.out.println("A");
		break;
		case 9 : System.out.println("A");
		break;
		case 8 : System.out.println("B");
		break;
		case 7 : System.out.println("C");
		break;
		default: System.out.println("F");
		break;
		}
	}
 
}
