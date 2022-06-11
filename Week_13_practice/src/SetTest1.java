import java.util.*;

public class SetTest1 {

	public static void main(String[] args) {
		// 12 - p.41 Set 예제 - 대량 연산 메소드
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s2.add("A");
		s2.add("D");
		Set<String> union = new HashSet<String>(s1);
		union.addAll(s2); // s1과 s2의 합집합
		Set<String> intersection = new HashSet<String>(s1);
		intersection.retainAll(s2); // s1과 s2의 교집합
		System.out.println("합집합: " + union);
		System.out.println("교집합: " + intersection);

	}

}
