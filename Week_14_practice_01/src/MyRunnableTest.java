
class MyRunnable implements Runnable {
	public void run() {
		for (int i = 10; i >= 0; i--)
			System.out.print(i + " ");
	}
}

public class MyRunnableTest {

	public static void main(String[] args) {
		// 13 - p.9 스레드를 생성하는 방법 (Runnable 인터페이스를 구현)
		Thread t = new Thread(new MyRunnable());
		t.start();
	}

}
