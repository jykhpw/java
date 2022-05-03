import java.awt.*;
import javax.swing.*;

public class MyFrame2 extends JFrame{
	// p.36 FlowLayout 실습
	
	public MyFrame2() {
		setTitle("FlowLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		// 패널을 생성하고 배치 관리자를 FlowLayout으로 설정
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		// 패널에 버튼을 생성하여 추가
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
