import java.util.*;

public class ArrayListTest {

	public static void printList(List<String> list) {
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 12 - p.31 ArrayList 예제
		ArrayList<String> list = new ArrayList<String>();
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		printList(list);
		
		list.add(1, "APPLE"); // 인덱스 1에 "APPLE"를 삽입
		printList(list);
		
		
		list.set(2, "GRAPE"); // 인덱스 2의 원소를 "GRAPE"로 대체
		printList(list);
		
		list.remove(3); // 인덱스 3의 원소를 삭제함
		printList(list);
	}

}
