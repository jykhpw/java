
public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = new int[10];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = (s.length - 1) - i; // �ε����� �������� �����ϱ�
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");
		}
	}

}
