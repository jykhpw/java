import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// 11 - p.25-26 예외 처리하기 예제
		try {
			System.out.println(readString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.print("문자열을 입력하시오: ");
		System.in.read(buf);
		return new String(buf);
	}

}
