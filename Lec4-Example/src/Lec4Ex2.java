import java.util.Scanner;

public class Lec4Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		
		while(true) {
			System.out.print("문자열을 입력하세요: ");
			Scanner input = new Scanner(System.in);
			str = input.next();
			
			if (str.equals("quit"))
				break;
			
			if (str.substring(0, 3).equals("www"))
				System.out.println(str + "은 'www'로 시작합니다.");
			else
				System.out.println(str + "은 'www'로 시작하지 않습니다.");
		}

	}

}
