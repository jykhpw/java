import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 10; // final���� ��� ����
		int[] numbers = new int[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			int r = (int) (Math.random() * 100); //�����Լ� random(): 0~1 ������ ���� ����
			numbers[i] = r; // �迭�� ������ ���� �ʱ�ȭ��
		}
		
		System.out.print("������ ����Ʈ: ");
		for (int r : numbers)
			System.out.print(r + " ");
		Arrays.sort(numbers); //�迭�� ����� ���ڸ� ũ������� ������
		
		System.out.print("\n���ĵ� ����Ʈ: ");
		for (int r : numbers)
			System.out.print(r + " ");
	}

}
