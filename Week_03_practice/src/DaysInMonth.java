import java.util.*;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int month;
		int days = 0;
		
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�: ");
		month = input.nextInt();
		
		switch(month) {
		case 2:
			days = 28;
			break;
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}
		
		System.out.println(month + "���� �� ���� " + days + "�Դϴ�.");
		
	}

}
