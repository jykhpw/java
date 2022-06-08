
public class ThreadTest {

	public static void main(String[] args) {
		// 13 - p. 12 람다식을 이용한 스레드
		Runnable task = () -> {
			for(int i = 10; i >= 0; i--)
				System.out.print(i + " ");
		};
		new Thread(task).start();
	}

}
