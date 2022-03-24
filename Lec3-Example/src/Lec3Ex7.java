import java.util.Scanner;

public class Lec3Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] s = { 0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100 }; // 오름차순 형태로 정렬 (가정)
		int number;
		
		System.out.print("정수를 입력하세요(1 ~ 99): ");
		number = input.nextInt();
		
		for (int i = 0; i < s.length; i++) { // 순차검색을 이용해 값이 해당하는 범위를 찾음
			if (s[i] > number && i > 0) {
				System.out.printf("%d는 %d보다 크고 %d보다 작습니다.", number, s[i-1], s[i]);
				break;
			}
		}
	}

}
