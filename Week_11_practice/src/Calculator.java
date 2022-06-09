import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 201920994 소프트웨어학과 김지예 - 11주차 과제 

public class Calculator extends JFrame implements ActionListener{

	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { 
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "=",
	};
	
	double num1 = 0, num2 = 0;
	double result = 0;
	int operator = 0; // 연산자
	boolean state = false; // 연산 완료 여부
	boolean init = true; // 계산기 처음 실행
	String nInput = "";

	public Calculator() {
		tField = new JTextField(35);
		panel = new JPanel();
		tField.setText("0.");
		tField.setEnabled(false);

		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				buttons[index].addActionListener(this);
				if( cols >= 3 )
					buttons[index].setForeground(Color.red);
				else 
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String input = e.getActionCommand();
		String tmp = "";
	
		if (init) {
			tField.setText("");
			tField.setEnabled(true);
			init = false;
		}
		
		if (input.equals("+")) {
			num1 = num2;
			operator = 1; // 더하기
			nInput = "";
			tField.setText(tField.getText() + input);
		} else if (input.equals("-")) {
			if (nInput.equals("")) { // -가 부호로 쓰일 경우
				operator = -1;
			} else {
				num1 = num2;
				operator = 2; // 빼기
				nInput = "";	
			}
			tField.setText(tField.getText() + input);
		} else if (input.equals("x")) {
			num1 = num2;
			operator = 3; // 곱하기
			nInput = "";
			tField.setText(tField.getText() + input);
		} else if (input.equals("/")) {
			num1 = num2;
			operator = 4; // 나누기
			nInput = "";
			tField.setText(tField.getText() + input);
		} else if (input.equals("%")) {
			num1 = num2;
			operator = 5; // 나머지
			nInput = "";
			tField.setText(tField.getText() + input);
		} else if (input.equals("=")) {
			switch (operator) {
				case 1: // 더하기
					result = num1 + num2;
					break;
				case 2: // 빼기
					result = num1 - num2;
					break;
				case 3: // 곱하기
					result = num1 * num2;
					break;
				case 4: // 나누기
					result = num1 / num2;
					break;
				case 5: // 나머지 연산
					result = num1 % num2;
					break;
			}
			tField.setText(tField.getText() + input + String.valueOf(result));
			state = true;
		} else if (input.equals("sqrt")) { // 루트 - 단항 연산자
			result = Math.sqrt(num2);
			tField.setText(input + "(" + num2 + ")=" + String.valueOf(result));
			state = true;
		} else if (input.equals("1/x")) { // 1/x 계산 - 단항 연산자
			result = 1 / num2;
			tField.setText("1/" + num2 + "=" + String.valueOf(result));
			state = true;
		} else if (input.equals("+/-")) {  // 음수/양수 변환 - 단항 연산자
			result = num2 * (-1);
			tField.setText("" + String.valueOf(result));
			state = true;
		} else if (input.equals(".") ) {
			if (nInput.equals("")) {
				nInput = "0.";
				tField.setText(tField.getText() + nInput);
			} else {
				nInput = input;
				tField.setText(tField.getText() + input);
			}
		} else if (input.equals("Backspace")) {
			tmp = tField.getText();
			if (operator != 0 && nInput.equals("")) {
				tmp = tmp.substring(0, tmp.length() - 1);
				tField.setText("" + tmp);
				operator = 0;
				nInput = Double.toString(num1);
				num2 = num1;
				num1 = 0;
			} else if (state) {
				boolean i1 = false, i2 = false;
				String op = "";
				if (num1 - (int)num1 == 0.0)
					i1 = true;
				if (num2 - (int)num2 == 0.0)
					i2 = true;
				switch(operator) {
					case 1:
						op = "+";
						break;
					case 2:
						op = "-";
						break;
					case 3:
						op = "x";
						break;
					case 4:
						op = "/";
						break;
					case 5:
						op = "%";
						break;
				}
				if (i1 && i2) {
					tField.setText((int)num1 + op + (int)num2);
				} else if (i1 && !i2) {
					tField.setText((int)num1 + op + num2);
				} else if (!i1 && i2) {
					tField.setText(num1 + op + (int)num2);
				} else {
					tField.setText(num1 + op + num2);
				}
				state = false;
			} else if (tmp.length() < 1) {
				nInput = "";
				num2 = 0;
				num1 = 0;
				tField.setText("");
			} else {
				nInput = nInput.substring(0, nInput.length() - 1);
				num2 = Double.parseDouble(nInput);
				tmp = tmp.substring(0, tmp.length() - 1);
				tField.setText(tmp);
			}
		} else if (input.equals("C")) { // Clear
			nInput = "";
			num2 = 0;
			num1 = 0;
			operator = 0;
			tField.setText("");
		} else if (input.equals("CE")) { // Clear Element
			String op = "";
			num2 = 0;
			nInput = "";
			if (operator != 0) {
				switch(operator) {
				case 1:
					op = "+";
					break;
				case 2:
					op = "-";
					break;
				case 3:
					op = "x";
					break;
				case 4:
					op = "/";
					break;
				case 5:
					op = "%";
					break;
				}
				if (num1 - (int)num1 == 0) {
					tField.setText((int)num1 + op);
				} else {
					tField.setText(num1 + op);
				}
			} else {
				if (num1 - (int)num1 == 0) {
					int n1 = (int) num1;
					tField.setText(String.valueOf(n1));
				} else {
					tField.setText(String.valueOf(num1));
				}
			}
		} else {
			if (state) {
				tField.setText("");
				state = false;
				num1 = 0;
				num2 = 0;
				operator = 0;
				nInput = "";
			}
			
			nInput += input;
			tField.setText(tField.getText() + input);
			num2 = Double.parseDouble(nInput); // 문자열에서 double형으로 형 변환
			if (operator == -1) {
				num2 *= (-1);
				nInput = Double.toString(num2);
				operator = 0;
			}
		}
	}

	public static void main(String args[]) {
		Calculator s = new Calculator();
	}
}