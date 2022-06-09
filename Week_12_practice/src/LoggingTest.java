import java.util.logging.Logger;

public class LoggingTest {

	public static void main(String[] args) {
		// 11 - p.37 로깅 예제
		String filename = "test.dat";
		Logger.getGlobal().info((filename + " 파일을 오픈하였음"));

	}

}
