import java.io.*;
import java.util.Date;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException {
		// 14 - p.27~28 객제 저장하기 (ObjectInputStream, ObjectOutputStream)
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			int c;
			out = new ObjectOutputStream(new FileOutputStream("./output/object.dat"));
			out.writeObject(new Date()); // 객체를 직렬화하여서 씀
			
			out.flush();
			in = new ObjectInputStream(new FileInputStream("./output/object.dat"));
			Date d = (Date) in.readObject();
			System.out.println(d);
		} catch (ClassNotFoundException e) {
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}

}
