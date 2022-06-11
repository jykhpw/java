import java.util.*;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// 12 - p.45 우선순위 큐 예제
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(30);
		pq.add(80);
		pq.add(20);
		
		for (Integer o : pq)
			System.out.println(o);
		System.out.println("원소 삭제");
		while(!pq.isEmpty())
			System.out.println(pq.remove());
	}

}
