import java.util.Scanner;

public class Lec3Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] s = { 0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100 }; // �������� ���·� ���� (����)
		int number;
		
		System.out.print("������ �Է��ϼ���(1 ~ 99): ");
		number = input.nextInt();
		
		for (int i = 0; i < s.length; i++) { // �����˻��� �̿��� ���� �ش��ϴ� ������ ã��
			if (s[i] > number && i > 0) {
				System.out.printf("%d�� %d���� ũ�� %d���� �۽��ϴ�.", number, s[i-1], s[i]);
				break;
			}
		}
	}

}
