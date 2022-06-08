import java.io.*;
import java.net.*;

public class URLConnectionReader {
	
	public static void main(String[] args) throws Exception {
		// 15 - 웹의 자원에 접근 (웹에서 파일 다운로드)
		URL site = new URL("https://www.naver.com");
		URLConnection url = site.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(
				url.getInputStream()));
		String inLine;
		
		while((inLine = in.readLine()) != null)
			System.out.println(inLine);
		in.close();
	}
	
}
