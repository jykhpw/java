import java.io.*;
import java.net.*;

public class DownloadImage {

	public static void main(String[] args) throws Exception {
		// 15 - p.9-10 웹에서 이미지 파일 다운로드하기
		//String website = "http://www.oracle.com/us/hp07-bg121314-openworld-2x-2280475.jpg";
		String website = "https://ssl.pstatic.net/melona/libs/1396/1396687/1b05c2b75d6f3bc0e8d5_20220602175018291.png";
		System.out.println("" + website + " 사이트에서 이미지를 다운로드합니다.");
		URL url = new URL(website);
		byte[] buffer = new byte[2048];
		try (InputStream in = url.openStream();
				OutputStream out = new FileOutputStream("./output/test.jpg");) {
			int length = 0;
			while ((length = in.read(buffer)) != -1) {
				System.out.println("" + length + "바이트만큼 읽었음!");
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			System.out.println("예외: " + e.getMessage());
		}
	}

}
