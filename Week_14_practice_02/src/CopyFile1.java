import java.io.*;

public class CopyFile1 {

	public static void main(String[] args) throws IOException{
		// 14 - p.10
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("./Input/input.txt");
			out = new FileOutputStream("./Output/CopyFile1_output.txt");
			int c;
			
			while((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}

}
