import java.util.Arrays;

public class pro1355808 {
		
	public static void main(String[] args) {
		int k = 3;
		int m = 4;
		int[] score = {1, 2, 3, 1, 2, 3, 1};
		int answer = 0;
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		System.out.println(score.length);
		for(int i = score.length; i >= m; i -= m) {  // 7 >= 4  7-= 4 
			answer += m * score[i - m];
		}
		System.out.print(answer);
	}
}


