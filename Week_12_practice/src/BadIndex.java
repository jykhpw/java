
public class BadIndex {

	public static void main(String[] args) {
		// 11 - p.11 ������ ��
		int[] array = new int[10];
		for (int i = 0; i < 10; i++)
			array[i] = 0;
		int result = array[12];	// �������� ���� �ε����� ����
		System.out.println("���� �� ������ ����ɱ��?"); // ������� ����
	}

}
