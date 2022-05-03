import java.awt.*;
import javax.swing.*;

public class MyFrame2 extends JFrame{
	// p.36 FlowLayout �ǽ�
	
	public MyFrame2() {
		setTitle("FlowLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		// �г��� �����ϰ� ��ġ �����ڸ� FlowLayout���� ����
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		// �гο� ��ư�� �����Ͽ� �߰�
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("B4"));
		panel.add(new JButton("Long Button5"));
		add(panel);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame2 f = new MyFrame2();
	}

}
