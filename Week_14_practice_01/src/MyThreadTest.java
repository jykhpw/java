
class MyThread extends Thread {
	public void run() {
		for (int i = 10; i >= 0; i--)
			System.out.print(i + " ");
	}
}

public class MyThreadTest {

	public static void main(String[] args) {
		// 13 - p.7 �����带 �����ϴ� ��� (Thread Ŭ������ ���)
		Thread t = new MyThread();
		t.start();
	}

}
