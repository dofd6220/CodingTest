public class pro120806 {

	public static void main(String[] args) {
		int answer = 0;
		int n = 123;
        String str = Integer.toString(n);
        int str1 = str.charAt(0) - '0';
        int str2 = str.charAt(1) - '0';
        int str3 = str.charAt(2) - '0';
        answer = str1 + str2 + str3;
        System.out.println(answer);

	}
}
