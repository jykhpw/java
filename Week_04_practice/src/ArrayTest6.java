import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
				{ 10, 20, 30, 40 },
				{ 50, 60, 70, 80 },
				{ 90, 100, 110, 120 }
		}; // ���� ���� 3, ���� ������ 4�� 2���� �迭 ���� �� �ʱ�ȭ
		
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				System.out.println(r + "��" + c + "��: " + array[r][c]);
			}
		}
	}

}