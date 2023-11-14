package baekjun;

import java.util.Scanner;

public class ex25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int fullPrice = sc.nextInt();
		int fullCnt = sc.nextInt();

		for(int i = 0; i < fullCnt; i++) {
			int price = sc.nextInt();
			int cnt = sc.nextInt();

			fullPrice = fullPrice - (price * cnt);
		}
		if(fullPrice == 0) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
	}

}
