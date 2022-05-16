import javax.swing.*;
import java.awt.event.*;

class MyFrame3 extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;
	public MyFrame3() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오.");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
			label.setText("마침내 버튼이 눌러졌습니다.");
	}
}

public class ActionEventText3 {

	public static void main(String[] args) {
		// p.17 이벤트 처리 방법 - (3) MyFrmae에서 이벤트도 처리하는 방법
		MyFrame3 f = new MyFrame3();
	}

}
