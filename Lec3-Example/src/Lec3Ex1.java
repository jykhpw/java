import java.util.Scanner;

public class Lec3Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("2���� ������ �Է��ϼ���: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + "�� " + num2 + " �� ū ���� " + num1 +"�Դϴ�.");
		} else {
			System.out.println(num1 + "�� " + num2 + " �� ū ���� " + num2 +"�Դϴ�.");
		}
	}

}