import java.awt.*;
import javax.swing.*;

public class MyFrame4 extends JFrame {
	// p.40 GridLayout 실습
	public MyFrame4() {
		setTitle("GridLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0, 3)); // 3개의 열과 필요한 만큼의 행
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame4 f = new MyFrame4();
	}

}
