import java.io.*;
import java.net.*;

public class Receiver {

	public static void main(String[] args) throws IOException {
		// 15 - p.25 UDP 이용 : Receiver 클래스(DatagramSocket, DatagramPacket)
		byte[] buf = new byte[256];
		
		DatagramSocket socket = new DatagramSocket(5001); // port number: 5000
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		System.out.println(new String(buf));
	}

}
