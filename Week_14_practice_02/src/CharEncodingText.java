import java.io.*;

public class CharEncodingText {

	public static void main(String[] args) throws IOException {
		// 14 - p.21 문자 엔코딩(Character Encoding)
		File fileDir = new File("./input/input.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream(fileDir), "UTF8"));
		String str;
		while ((str = in.readLine()) != null) { 
			System.out.println(str);
		}
	}

}
