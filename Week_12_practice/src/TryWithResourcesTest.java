import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TryWithResourcesTest {

	public static void main(String[] args) throws FileNotFoundException {
		// 11 - p.15 try-with-resources ¿¹Á¦
		ArrayList<String> list = new ArrayList<String>();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		try (PrintWriter output = new PrintWriter("myoutput.txt")) {
			for (String s : list) {
				output.println(s.toLowerCase());
			}
		}
	}

}
