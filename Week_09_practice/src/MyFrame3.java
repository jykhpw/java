import java.awt.*;
import javax.swing.*;

public class MyFrame3 extends JFrame {
	// p.38 BorderLayout 실습
	public MyFrame3() {
		setTitle("BorderLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 프레임은 디폴트로 BorderLayout이므로 사실은 불필요
		setLayout(new BorderLayout());
		
		// 버튼을 추가한다.
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("Line Start"), BorderLayout.LINE_START);
		add(new JButton("Line End"), BorderLayout.LINE_END);
		add(new JButton("Page Start"), BorderLayout.PAGE_START);
		add(new JButton("Page End"), BorderLayout.PAGE_END);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame3 f = new MyFrame3();
	}

}
