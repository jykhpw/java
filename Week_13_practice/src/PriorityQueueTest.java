import java.util.*;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// 12 - p.45 �켱���� ť ����
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(30);
		pq.add(80);
		pq.add(20);
		
		for (Integer o : pq)
			System.out.println(o);
		System.out.println("���� ����");
		while(!pq.isEmpty())
			System.out.println(pq.remove());
	}

}
