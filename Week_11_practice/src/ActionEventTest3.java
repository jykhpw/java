import javax.swing.*;
import java.awt.event.*;

class MyFrame4 extends JFrame {
	private JButton button;
	private JLabel label;
	public MyFrame4() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오.");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button)
					label.setText("마침내 버튼이 눌러졌습니다.");
			}
		}); // 안드로이드에서 많이 사용됨
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
}

public class ActionEventTest3 {

	public static void main(String[] args) {
		// p.18 이벤트 처리 방법 - (4) 무명 클래스를 사용하는 방법
		MyFrame4 f = new MyFrame4();
	}

}
