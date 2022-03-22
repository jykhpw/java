import java.util.Scanner;

public class Lec3Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("2개의 정수를 입력하세요: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + "과 " + num2 + " 중 큰 수는 " + num1 +"입니다.");
		} else {
			System.out.println(num1 + "과 " + num2 + " 중 큰 수는 " + num2 +"입니다.");
		}
	}

}