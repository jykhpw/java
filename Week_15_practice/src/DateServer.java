import java.io.*;
import java.net.*;
import java.util.Date;

public class DateServer {

	public static void main(String[] args) throws IOException {
		// 15 - p.21 날씨 서버 제작
		ServerSocket ss = new ServerSocket(9101);
		try {
			while(true) {
				Socket socket = ss.accept();
				try {
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println(new Date().toString());
				} finally {
					socket.close();
				}
			}
		} finally {
			ss.close();
		}

	}

}
