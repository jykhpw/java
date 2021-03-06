import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MessengerA {

	protected JTextField textField;
	protected JTextArea textArea;
	DatagramSocket socket;
	DatagramPacket packet;
	InetAddress address = null;
	final int myPort = 5001;	// 수신용 포트 번호
	final int otherPort = 6001;	// 송신용 포트 번호
	
	public MessengerA() throws IOException {
		MyFrame f = new MyFrame();
		address = InetAddress.getByName("192.168.35.97");
		socket = new DatagramSocket(myPort);
	}
	
	// 패킷을 받아서 텍스트 영역에 표시한다.
	public void process() {
		while(true) {
			try {
				byte[] buf = new byte[256];
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet); // 패킷을 받는다.
				// 받은 패킷을 텍스트 영역에 표시한다.
				textArea.append("RECEIVED: " + new String(buf) + "\n");
			} catch(IOException ioException) {
				ioException.printStackTrace();
			}
		}
	}
	
	// 내부 클래스 정의
	class MyFrame extends JFrame implements ActionListener {
		public MyFrame() {
			super("MessengerA");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			textField = new JTextField(30);
			textField.addActionListener(this);
			
			textArea = new JTextArea(10, 30);
			textArea.setEditable(false);
			
			add(textField, BorderLayout.PAGE_END);
			add(textArea, BorderLayout.CENTER);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt) {
			String s = textField.getText();
			byte[] buffer = s.getBytes();
			DatagramPacket packet;
			
			// 패킷을 생성함
			packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
			try {
				socket.send(packet); // 패킷을 보냄
			} catch (IOException e) {
				e.printStackTrace();
			}
			textArea.append("SENT: " + s + "\n");
			textField.selectAll();
			textArea.setCaretPosition(textArea.getDocument().getLength());;
		}
	}
	
	public static void main(String[] args) throws IOException {
		// 15 - p.27~32 UDP를 이용한 서버와 클라이언트 작성(MessengerA 클래스)
		MessengerA m = new MessengerA();
		m.process();
	}
}