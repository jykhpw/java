import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int number;
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		number = input.nextInt();
		
		for (int i = 1; i <= number; i++)
			sum += i;
		
		System.out.printf("1���� %d������ ������ �� = %d", number, sum);
	}

}
