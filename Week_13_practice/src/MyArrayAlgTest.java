
class MyArrayAlg {
	public static<T> T getLast(T[] a) {
		return a[a.length - 1];
	}
	
	// 12 - p.12-13 swap(int i, int j) �޼ҵ� (���׸� �޼ҵ�� �ۼ�)
	public static<T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	// 12 - p.14 Ư���� ������ ��ü���� �ް� �ϰ� ���� ���
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
		// 12 - p.11 ���׸� �޼ҵ�
		String[] language = { "C++", "C#", "JAVA" };
		String last = MyArrayAlg.getLast(language); // last = "JAVA"
		System.out.println(last);
		
		// 12 - p.12-13 ���׸� �޼ҵ� �ǽ�
		MyArrayAlg.swap(language, 1, 2);
		for (String value : language) {
			System.out.println(value);
		}
	}

}
