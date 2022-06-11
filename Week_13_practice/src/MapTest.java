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
		// 12 - p.47-48 Map ����
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20040001", new Student(20040001, "Alice"));
		st.put("20040002", new Student(20040002, "Bob"));
		st.put("20040003", new Student(20040003, "Jane"));
		
		// ��� �׸��� �����
		System.out.println(st);
		
		// �ϳ��� �׸��� ������
		st.remove("20040002");
		
		// �ϳ��� �׸��� ��ġ��
		st.put("20040003", new Student(20040003, "Jin"));
		
		// ���� ������
		System.out.println(st.get("20040003"));
		
		// ��� �׸��� �湮��
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = "+ value);
		}
	}

}
