import java.util.*;

public class SortTest {

	public static void main(String[] args) {
		// 12 - p.52 sort ¿¹Á¦
		String[] sample = { "i", "walk", "the", "line" };
		List<String> list = Arrays.asList(sample);
		Collections.sort(list);
		System.out.println(list);
	}

}
