import java.util.Scanner;

public class Lec3Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int iterator;
		double pi = 0;
		double denominator = 1; // 분모
		
		System.out.print("반복 횟수를 입력하세요: ");
		iterator = input.nextInt();
		
		for (int i = 1; i <= iterator; i++) {
			if (i % 2 != 0)
				pi = pi + 4 / denominator;
			else
				pi = pi - 4 / denominator;
			
			denominator += 2;
		}
		
		System.out.println("계산된 pi 값: " + pi);
	}

}
