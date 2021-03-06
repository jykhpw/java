import java.net.*;
import java.io.*;

public class Sender {

	public static void main(String[] args) throws IOException {
		// 15 - p.24 UDP 이용 : Sender 클래스(DatagramSocket, DatagramPacket)
		DatagramSocket socket = null;
		socket = new DatagramSocket();
		String s = "우리는 여전히 우리 운명의 주인이다.";
		byte[] buf = s.getBytes();
		
		// "address"의 "port"에 있는 클라이언트에게 데이터를 보낸다.
		InetAddress address = InetAddress.getByName("192.168.35.97"); // 로컬 호스트
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address,5001);
		socket.send(packet);
		socket.close();

	}

}
