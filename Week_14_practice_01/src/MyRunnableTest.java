
class MyRunnable implements Runnable {
	public void run() {
		for (int i = 10; i >= 0; i--)
			System.out.print(i + " ");
	}
}

public class MyRunnableTest {

	public static void main(String[] args) {
		// 13 - p.9 �����带 �����ϴ� ��� (Runnable �������̽��� ����)
		Thread t = new Thread(new MyRunnable());
		t.start();
	}

}
