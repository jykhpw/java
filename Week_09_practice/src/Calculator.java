import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{
	
	// 소프트웨어학과 201920994 김지예 9주차 과제
	
	private JPanel panel;
	private JTextField textField;
	private JButton[] buttons;
	private String[] labels = {
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "="
	};
	
	public Calculator() {
		setTitle("김지예의 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(40);
		panel = new JPanel();
		textField.setText("0.");
		textField.setEnabled(false);
		
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int idx = 0;
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				buttons[idx] = new JButton(labels[idx]);
				buttons[idx].setBackground(Color.yellow);
				if(c >= 3)
					buttons[idx].setForeground(Color.red);
				else
					buttons[idx].setForeground(Color.blue);
				panel.add(buttons[idx]);
				idx++;
			}
		}
		add(textField, BorderLayout.PAGE_START);
		add(panel, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
	}

}
