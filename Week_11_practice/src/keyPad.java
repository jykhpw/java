import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class keyPad extends JFrame implements ActionListener {
	private JTextField txt;
	private JPanel panel;
	
	public keyPad() {
		txt = new JTextField(20);
		add(txt, BorderLayout.NORTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		add(panel, BorderLayout.CENTER);
		for (int i = 1; i <= 9; i++) {
			JButton btn = new JButton("" + i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100, 100));
			panel.add(btn);
		}
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		txt.setText(txt.getText() + actionCommand);
	}
	
	public static void main(String[] args) {
		// p.20-21 이벤트 처리 방법 - 키패드 만들기
		new keyPad();
	}

}
