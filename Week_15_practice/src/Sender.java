import java.net.*;
import java.io.*;

public class Sender {

	public static void main(String[] args) throws IOException {
		// 15 - p.24 UDP �̿� : Sender Ŭ����(DatagramSocket, DatagramPacket)
		DatagramSocket socket = null;
		socket = new DatagramSocket();
		String s = "�츮�� ������ �츮 ����� �����̴�.";
		byte[] buf = s.getBytes();
		
		// "address"�� "port"�� �ִ� Ŭ���̾�Ʈ���� �����͸� ������.
		InetAddress address = InetAddress.getByName("192.168.35.97"); // ���� ȣ��Ʈ
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address,5001);
		socket.send(packet);
		socket.close();

	}

}
