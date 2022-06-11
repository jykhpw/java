import java.util.*;

public class SearchTest {

	public static void main(String[] args) {
		// 12 - p.54 Saerch 예제
		int key = 50;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++)
			list.add(i);
		int index = Collections.binarySearch(list, key);
		System.out.println("탐색의 반환값 = " + index);
	}

}
