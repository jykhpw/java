import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{ // JFrame을 상속해서 MyFrame을 정의
	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300, 200);
		setLocation(screenSize.width/2, screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		Image img = kit.getImage("icon.gif");
		setIconImage(img);
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
