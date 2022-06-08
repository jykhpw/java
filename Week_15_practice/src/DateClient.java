import java.io.*;
import java.net.Socket;

public class DateClient {

	public static void main(String[] args) throws IOException {
		// 15 - p.22 날씨 클라이언트 제작
		Socket s = new Socket("localhost", 9101);
		BufferedReader input =
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		String res = input.readLine();
		System.out.println(res);
		System.exit(0);
	}

}
