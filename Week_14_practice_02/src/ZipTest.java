import java.io.*;
import java.util.zip.*;

public class ZipTest {

	public static void main(String[] args) throws IOException {
		// 14 - p.25 압축 파일 풀기
		FileInputStream fin = new FileInputStream("./input/test.zip");
		ZipInputStream zin = new ZipInputStream(fin);
		ZipEntry entry = null;
		while((entry = zin.getNextEntry()) != null) {
			System.out.println("압축 해제: " + entry.getName());
			String outputName = "./output/" + entry.getName();
			FileOutputStream fout = new FileOutputStream(outputName);
			for (int c = zin.read(); c != -1; c = zin.read()) {
				fout.write(c);
			}
			
			zin.closeEntry();
			fout.close();
		}
		zin.close();
	}

}
