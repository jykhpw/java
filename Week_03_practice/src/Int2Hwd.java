import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("������ �Է��ϼ���: ");
		number = input.nextInt();
		
		switch(number) {
		case 0:
			System.out.println("��.");
			break;
		case 1:
			System.out.println("�ϳ�.");
			break;
		case 2:
			System.out.println("��.");
			break;
		case 3:
			System.out.println("��");
			break;
		default:
			System.out.println("3 �̻��� ����.");
			break;
		}
	}

}
