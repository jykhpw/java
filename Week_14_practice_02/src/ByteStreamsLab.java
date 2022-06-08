import java.io.*;
import java.util.*;

public class ByteStreamsLab {

	public static void main(String[] args) throws IOException {
		// 14 - p.12 ~ 13 바이트 스트림
		Scanner scan = new Scanner(System.in);
		System.out.print("원본 파일 이름을 입력하시오: "); // ./input/input_image.jpg 입력
		String inputFileName = scan.next();
		System.out.print("복사 파일 이름을 입력하시오: ");	// ./output/output_image.jpg 입력
		String outputFileName = scan.next();
		try {
			InputStream inputStream = new FileInputStream(inputFileName);
			OutputStream outputStream = new FileOutputStream(outputFileName);
			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally { }
		
		System.out.println(inputFileName + "을" + outputFileName + "로 복사함");
		
		
	}

}
