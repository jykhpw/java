import java.io.*;
import java.net.*;

public class host2ip {

	public static void main(String[] args) throws IOException {
		// 15 - p.6 IP Ȯ�� ����
		String hostname = "www.naver.com";
		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP �ּ�: " + address.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(hostname + "�� IP �ּҸ� ã�� �� �����ϴ�.");
		}
	}

}
