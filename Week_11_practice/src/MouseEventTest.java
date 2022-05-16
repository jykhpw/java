import javax.swing.*;
import java.awt.event.*;

class MyFrame7 extends JFrame implements MouseListener, MouseMotionListener {
	public MyFrame7() {
		setTitle("Mouse Event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(this); // 마우스 이벤트 처리기를 붙임
		panel.addMouseMotionListener(this);
		add(panel);
		setVisible(true);
	}
	
	public void mousePressed(MouseEvent e) {
		display("Mouse pressed(# of clicks: " + e.getClickCount() + ")", e);
	}
	
	public void mouseReleased(MouseEvent e) {
		display("Mouse release(# of clicks: " + e.getClickCount() + ")", e);
	}
	
	public void mouseEntered(MouseEvent e) {
		display("Mouse entered", e);
	}
	
	public void mouseExited(MouseEvent e) {
		display("Mouse exited", e);
	}
	
	public void mouseClicked(MouseEvent e) {
		display("Mouse clicked(# of clicks: " + e.getClickCount() + ")", e);
	}
	
	protected void display(String s, MouseEvent e) {
		System.out.println(s + "X = " + e.getX() + ", Y = " + e.getY());
	}
	
	public void mouseDragged(MouseEvent e) {
		display("Mouse Drageed", e);
	}
	
	public void mouseMoved(MouseEvent e) {
		display("Mouse Moved", e);
	}
}

public class MouseEventTest {

	public static void main(String[] args) {
		// p.40 - 42 Mouse 이벤트 - 마우스 이벤트 예제ㅣ
		MyFrame7 f = new MyFrame7();
	}

}
