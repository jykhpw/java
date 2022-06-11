import java.util.*;

public class ArrayListTest {

	public static void printList(List<String> list) {
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 12 - p.31 ArrayList ����
		ArrayList<String> list = new ArrayList<String>();
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		printList(list);
		
		list.add(1, "APPLE"); // �ε��� 1�� "APPLE"�� ����
		printList(list);
		
		
		list.set(2, "GRAPE"); // �ε��� 2�� ���Ҹ� "GRAPE"�� ��ü
		printList(list);
		
		list.remove(3); // �ε��� 3�� ���Ҹ� ������
		printList(list);
	}

}
