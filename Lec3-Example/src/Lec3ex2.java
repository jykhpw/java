import java.util.Scanner;

public class Lec3ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("양의 정수를 입력하세요: ");
		number = input.nextInt();
		
		System.out.printf("%d의 약수는 다음과 같습니다.\n", number);
		for(int i = 1; i <= number; i++) {
			if (number % i == 0)
				System.out.printf("%d ", i);
		}
	}

}
