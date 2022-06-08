
class Counter {
	private int value = 0;
	public void increment() { value++; }
	public void decrement() { value--; }
	public void printCounter() { System.out.println(value); }
}

class MyThread1 extends Thread {
	Counter sharedCounter;
	public MyThread1(Counter c) {
		this.sharedCounter = c;
	}
	public void run() {
		int i = 0;
		while (i < 20000) {
			sharedCounter.increment();
			sharedCounter.decrement();
			if (i % 40 == 0)
				sharedCounter.printCounter();
			try {
				sleep((int)(Math.random() * 2));
			} catch (InterruptedException e) {
				i++;
			}
		}
	}
}

public class CounterTest {

	public static void main(String[] args) {
		// 13 - p.22 ������ ����
		Counter c = new Counter();
		new MyThread1(c).start();
		new MyThread1(c).start();
		new MyThread1(c).start();
		new MyThread1(c).start();
	}

}
