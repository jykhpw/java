import java.io.*;
import java.util.*;

public class ByteStreamsLab {

	public static void main(String[] args) throws IOException {
		// 14 - p.12 ~ 13 ����Ʈ ��Ʈ��
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �̸��� �Է��Ͻÿ�: "); // ./input/input_image.jpg �Է�
		String inputFileName = scan.next();
		System.out.print("���� ���� �̸��� �Է��Ͻÿ�: ");	// ./output/output_image.jpg �Է�
		String outputFileName = scan.next();
		try {
			InputStream inputStream = new FileInputStream(inputFileName);
			OutputStream outputStream = new FileOutputStream(outputFileName);
			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally { }
		
		System.out.println(inputFileName + "��" + outputFileName + "�� ������");
		
		
	}

}
