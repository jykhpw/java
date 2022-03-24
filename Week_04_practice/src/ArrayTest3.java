
public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s = new int[5];
		for (int i = 0; i < s.length; i++) {
			s[i] = 0;
		} // for문을 이용하여 크기가 5인 배열을 0으로 초기화함 - 초기화 방법 1
		
		s[0] = 10;
		for (int i = 1; i < s.length; i++) {
			s[i] = s[i-1] + 10;
		} // 배열에 10, 20, 30, 40, 50을 수식을 이용하여 순서대로 넣음
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

}
