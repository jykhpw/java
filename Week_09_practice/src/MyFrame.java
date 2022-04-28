import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame extends JFrame{ // JFrame을 상속해서 MyFrame을 정의
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout()); // 배치 관리자 설정
		JButton button = new JButton("버튼"); // 컴포넌트 생성 및 추가
		this.add(button);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame(); // MyFrame의 객체를 생성함
	}
}
