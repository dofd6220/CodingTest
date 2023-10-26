import java.util.ArrayList;
//import java.util.Comparator;

public class pro12928 {
	public static void main(String[] args) {
		int n = 12;
		int answer = 0;
		
		ArrayList<Integer> arr = new ArrayList<>(); 
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				arr.add(i);
			}
		}

		//arr.sort(Comparator.naturalOrder()); 오름차순
		
		for(int i = 0; i < arr.size(); i++) {
			answer += arr.get(i);
		}
		System.out.println(arr);
		
		System.out.println(answer);
		
		
	}
}
