public class pro181943 {

	public static void main(String[] args) {
		String my_str = "He11oWor1d";
		String over_str = "lloWorl";
		int s = 2;
		String answer =  my_str.substring(0, s) + over_str;
		if(answer.length() < my_str.length()) {
			answer += my_str.charAt(my_str.length()-1);
		}
		System.out.println(answer);

	}

}
