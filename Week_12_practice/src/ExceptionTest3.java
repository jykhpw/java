
public class ExceptionTest3 {

	public static void main(String[] args) {
		// 11 - p.31-32 예외 처리하기 예제
		try {
			int num = Integer.parseInt("ABC");
			System.out.println(num);
		} catch(NumberFormatException e) {
			System.out.println("NumberFormat 예외 발생");
		}
	}

}
