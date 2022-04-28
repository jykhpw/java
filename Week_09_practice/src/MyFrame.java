import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{ // JFrame�� ����ؼ� MyFrame�� ����
	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300, 200);
		setLocation(screenSize.width/2, screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		Image img = kit.getImage("icon.gif");
		setIconImage(img);
		setLayout(new FlowLayout()); // ��ġ ������ ����
		JButton button = new JButton("��ư"); // ������Ʈ ���� �� �߰�
		this.add(button);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame(); // MyFrame�� ��ü�� ������
	}
}
