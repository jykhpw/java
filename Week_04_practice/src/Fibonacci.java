
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = new int[20];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = 0;
		}
		
		s[0] = 1;
		s[1] = 1;
		for(int i = 2; i < s.length; i++) {
			s[i] = s[i - 1] + s[i - 2];
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

}
