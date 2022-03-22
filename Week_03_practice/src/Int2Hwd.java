import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("정수를 입력하세요: ");
		number = input.nextInt();
		
		switch(number) {
		case 0:
			System.out.println("영.");
			break;
		case 1:
			System.out.println("하나.");
			break;
		case 2:
			System.out.println("둘.");
			break;
		case 3:
			System.out.println("셋");
			break;
		default:
			System.out.println("3 이상의 숫자.");
			break;
		}
	}

}
