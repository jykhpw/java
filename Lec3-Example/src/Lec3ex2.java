import java.util.Scanner;

public class Lec3ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("���� ������ �Է��ϼ���: ");
		number = input.nextInt();
		
		System.out.printf("%d�� ����� ������ �����ϴ�.\n", number);
		for(int i = 1; i <= number; i++) {
			if (number % i == 0)
				System.out.printf("%d ", i);
		}
	}

}
