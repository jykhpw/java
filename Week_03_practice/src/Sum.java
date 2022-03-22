import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int number;
		
		System.out.print("숫자를 입력하세요: ");
		number = input.nextInt();
		
		for (int i = 1; i <= number; i++)
			sum += i;
		
		System.out.printf("1부터 %d까지의 정수의 합 = %d", number, sum);
	}

}
