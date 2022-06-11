import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MessengerB {

	protected JTextField textField;
	protected JTextArea textArea;
	DatagramSocket socket;
	DatagramPacket packet;
	InetAddress address = null;
	final int myPort = 6001;	// ���ſ� ��Ʈ ��ȣ
	final int otherPort = 5001;	// �۽ſ� ��Ʈ ��ȣ
	
	public MessengerB() throws IOException {
		MyFrame f = new MyFrame();
		address = InetAddress.getByName("192.168.35.97");
		socket = new DatagramSocket(myPort);
	}
	
	// ��Ŷ�� �޾Ƽ� �ؽ�Ʈ ������ ǥ���Ѵ�.
	public void process() {
		while(true) {
			try {
				byte[] buf = new byte[256];
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet); // ��Ŷ�� �޴´�.
				// ���� ��Ŷ�� �ؽ�Ʈ ������ ǥ���Ѵ�.
				textArea.append("RECEIVED: " + new String(buf) + "\n");
			} catch(IOException ioException) {
				ioException.printStackTrace();
			}
		}
	}
	
	// ���� Ŭ���� ����
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
			
			// ��Ŷ�� ������
			packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
			try {
				socket.send(packet); // ��Ŷ�� ����
			} catch (IOException e) {
				e.printStackTrace();
			}
			textArea.append("SENT: " + s + "\n");
			textField.selectAll();
			textArea.setCaretPosition(textArea.getDocument().getLength());;
		}
	}
	
	public static void main(String[] args) throws IOException {
		// 15 - p.27~32 UDP�� �̿��� ������ Ŭ���̾�Ʈ �ۼ�(MessengerB Ŭ����)
		MessengerB m = new MessengerB();
		m.process();
	}

}