import java.io.*;
import java.net.*;

public class host2ip {

	public static void main(String[] args) throws IOException {
		// 15 - p.6 IP 확인 예제
		String hostname = "www.naver.com";
		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP 주소: " + address.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(hostname + "의 IP 주소를 찾을 수 없습니다.");
		}
	}

}
