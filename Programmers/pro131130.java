import java.util.Arrays;

public class pro131130 {

	public static void main(String[] args) {
		int[] cards = { 8,6,3,7,2,5,1,4 };
		Arrays.sort(cards);
		for(int i = 1; i < cards.length; i++) {
			cards[i] = cards[i - 1];
		}
	}

}
