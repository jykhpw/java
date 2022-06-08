
class MyThread extends Thread {
	public void run() {
		for (int i = 10; i >= 0; i--)
			System.out.print(i + " ");
	}
}

public class MyThreadTest {

	public static void main(String[] args) {
		// 13 - p.7 스레드를 생성하는 방법 (Thread 클래스를 상속)
		Thread t = new MyThread();
		t.start();
	}

}
