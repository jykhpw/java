import java.util.Scanner;

public class Month2Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String month;
		
		System.out.print("월의 이름을 입력하세요: ");
		month = input.next();
		
		int monthNum;
		switch(month) {
		case "january":
			monthNum = 1;
			break;
		case "february":
			monthNum = 2;
			break;
		case "march":
			monthNum = 3;
			break;
		case "april":
			monthNum = 4;
			break;
		case "may":
			monthNum = 5;
			break;
		case "june":
			monthNum = 6;
			break;
		case "july":
			monthNum = 7;
			break;
		case "august":
			monthNum = 8;
			break;
		case "september":
			monthNum = 9;
			break;
		case "October":
			monthNum = 10;
			break;
		case "November":
			monthNum = 11;
			break;
		case "December":
			monthNum = 12;
			break;
		default:
			monthNum = 0;
			break;
		}
		System.out.println(month + ": " + monthNum);
	}

}
