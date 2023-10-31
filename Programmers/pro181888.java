import java.util.Arrays;

public class pro181888 {

	public static void main(String[] args) {
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 2;
		int[] answer = new int[num_list.length / n];
		for (int i = 0; i < num_list.length; i += n) {
		    answer[i / n] += num_list[i];
		}

		System.out.print(Arrays.toString(answer));
	}

}
