import java.util.*;

class Student {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class MapTest {

	public static void main(String[] args) {
		// 12 - p.47-48 Map 예제
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20040001", new Student(20040001, "Alice"));
		st.put("20040002", new Student(20040002, "Bob"));
		st.put("20040003", new Student(20040003, "Jane"));
		
		// 모든 항목을 출력함
		System.out.println(st);
		
		// 하나의 항목을 삭제함
		st.remove("20040002");
		
		// 하나의 항목을 대치함
		st.put("20040003", new Student(20040003, "Jin"));
		
		// 값을 참조함
		System.out.println(st.get("20040003"));
		
		// 모든 항목을 방문함
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = "+ value);
		}
	}

}
