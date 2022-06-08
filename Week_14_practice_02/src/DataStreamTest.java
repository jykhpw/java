import java.io.*;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		// 14 - p.23 DataInputStream, DataOutputStream
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			int c;
			
			out = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream("./output/data.bin")));
			out.writeDouble(3.14);
			out.writeInt(100);
			out.writeUTF("¾È³ç.");
			out.flush();
			
			in = new DataInputStream(new BufferedInputStream(
					new FileInputStream("./output/data.bin")));
			System.out.println(in.readDouble());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
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
