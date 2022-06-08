import java.io.*;

public class CopyFile2 {

	public static void main(String[] args) throws IOException {
		// 14 - p.15 문자 스트림을 이용한 텍스트 복사
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader("./input/input.txt");
			outputStream = new FileWriter("./output/CopyFile2_output.txt");
			
			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}

}
