
class MyArrayAlg {
	public static<T> T getLast(T[] a) {
		return a[a.length - 1];
	}
	
	// 12 - p.12-13 swap(int i, int j) 메소드 (제네릭 메소드로 작성)
	public static<T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	// 12 - p.14 특정한 종류의 객체만을 받게 하고 싶은 경우
	public static <T extends Comparable> T getMax(T[] a) {
		if (a == null || a.length == 0)
			return null;
		T largest = a[0];
		for (int i = 1; i < a.length; i++)
			if (largest.compareTo(a[i]) < 0)
				largest = a[i];
		return largest;
	}
}

public class MyArrayAlgTest {

	public static void main(String[] args) {
		// 12 - p.11 제네릭 메소드
		String[] language = { "C++", "C#", "JAVA" };
		String last = MyArrayAlg.getLast(language); // last = "JAVA"
		System.out.println(last);
		
		// 12 - p.12-13 제네릭 메소드 실습
		MyArrayAlg.swap(language, 1, 2);
		for (String value : language) {
			System.out.println(value);
		}
	}

}
