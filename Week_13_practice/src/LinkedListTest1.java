import java.util.*;

public class LinkedListTest1 {

	public static void main(String[] args) {
		// 12 - p.34 LinkedList 예제 - 반복자 사용
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("하나 ");
		list.add("둘 ");
		list.add("셋 ");
		list.add("넷 ");
		
		String s;
		Iterator e = list.iterator();
		while(e.hasNext()) {
			s = (String) e.next(); // 반복자 - Object 타입을 반환
			System.out.println(s);
		}

	}

}
