
class MyArrayAlg {
	public static<T> T getLast(T[] a) {
		return a[a.length - 1];
	}
}

public class MyArrayAlgTest {

	public static void main(String[] args) {
		// 12 - p.11 제네릭 메소드
		String[] language = { "C++", "C#", "JAVA" };
		String last = MyArrayAlg.getLast(language); // last = "JAVA"
		System.out.println(last);
	}

}
