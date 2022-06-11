import java.util.*;

public class WildCardTest {
	
	// 12 - p.17 ������ �ִ� ���ϵ� ī��(Upper Bounded Wildcard)
	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list)
			s+= n.doubleValue();
		return s;
	}
	
	// 12 - p.18 ���� ���� ���ϵ� ī��(Unbounded Wildcard)
	public static void printList(List<?> list) {
		for (Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}
	
	// 12 - p.20 ������ �ִ� ���ϵ� ī��
	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++)
			list.add(i);
	}

	public static void main(String[] args) {
		// 12 - p.17 ������ �ִ� ���ϵ� ī��(Upper Bounded Wildcard)
		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));

		// 12 - p.19 ���� ���� ���ϵ� ī��(Unbounded Wildcard)
		List<String> ls = Arrays.asList("one", "two", "three");
		printList(li);
		printList(ls);
	}

}
