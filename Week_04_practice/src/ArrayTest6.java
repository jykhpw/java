import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
				{ 10, 20, 30, 40 },
				{ 50, 60, 70, 80 },
				{ 90, 100, 110, 120 }
		}; // 행의 개수 3, 열의 개수가 4인 2차원 배열 선언 후 초기화
		
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				System.out.println(r + "행" + c + "열: " + array[r][c]);
			}
		}
	}

}
