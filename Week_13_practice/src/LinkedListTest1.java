import java.util.*;

public class LinkedListTest1 {

	public static void main(String[] args) {
		// 12 - p.34 LinkedList ���� - �ݺ��� ���
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("�ϳ� ");
		list.add("�� ");
		list.add("�� ");
		list.add("�� ");
		
		String s;
		Iterator e = list.iterator();
		while(e.hasNext()) {
			s = (String) e.next(); // �ݺ��� - Object Ÿ���� ��ȯ
			System.out.println(s);
		}

	}

}
