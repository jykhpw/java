import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame{ // JFrame�� ����ؼ� MyFrame�� ����
	/*public MyFrame() {
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
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame(); // MyFrame�� ��ü�� ������
	}
	
	public MyFrame() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFram");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label1);
		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("������������");
		JButton button3 = new JButton("�Ұ�� ����");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		JLabel label2 = new JLabel("����");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
	}
}
