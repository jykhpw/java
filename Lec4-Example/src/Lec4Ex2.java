import java.util.Scanner;

public class Lec4Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		
		while(true) {
			System.out.print("���ڿ��� �Է��ϼ���: ");
			Scanner input = new Scanner(System.in);
			str = input.next();
			
			if (str.equals("quit"))
				break;
			
			if (str.substring(0, 3).equals("www"))
				System.out.println(str + "�� 'www'�� �����մϴ�.");
			else
				System.out.println(str + "�� 'www'�� �������� �ʽ��ϴ�.");
		}

	}

}
