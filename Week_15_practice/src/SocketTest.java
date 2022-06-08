import java.io.*;
import java.net.Socket;
import java.util.*;

public class SocketTest {

	public static void main(String[] args) throws IOException {
		// 15 - p.16 소켓 통신 예제
		try (Socket s = new Socket("time-c.nist.gov", 13)){
			InputStream inStream = s.getInputStream();
			Scanner in = new Scanner(inStream);
			while (in.hasNextLine()) {
				String line = in.nextLine();
				System.out.println(line);
			}
		}

	}

}
