
public class BadIndex {

	public static void main(String[] args) {
		// 11 - p.11 예외의 예
		int[] array = new int[10];
		for (int i = 0; i < 10; i++)
			array[i] = 0;
		int result = array[12];	// 존재하지 않은 인덱스에 접근
		System.out.println("과연 이 문장이 실행될까요?"); // 실행되지 않음
	}

}
