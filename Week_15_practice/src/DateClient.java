import java.io.*;
import java.net.Socket;

public class DateClient {

	public static void main(String[] args) throws IOException {
		// 15 - p.22 ���� Ŭ���̾�Ʈ ����
		Socket s = new Socket("localhost", 9101);
		BufferedReader input =
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		String res = input.readLine();
		System.out.println(res);
		System.exit(0);
	}

}
