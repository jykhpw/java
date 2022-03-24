
public class Lec3Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19 };
		int min = s[0];
		
		for (int i = 1; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			}
		}
		
		System.out.printf("배열 s의 최솟값: %d", min);
	}
	
}
