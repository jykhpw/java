
public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s = new int[5];
		for (int i = 0; i < s.length; i++) {
			s[i] = 0;
		} // for���� �̿��Ͽ� ũ�Ⱑ 5�� �迭�� 0���� �ʱ�ȭ�� - �ʱ�ȭ ��� 1
		
		s[0] = 10;
		for (int i = 1; i < s.length; i++) {
			s[i] = s[i-1] + 10;
		} // �迭�� 10, 20, 30, 40, 50�� ������ �̿��Ͽ� ������� ����
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

}
