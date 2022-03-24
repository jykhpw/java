import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 10; // final으로 상수 선언
		int[] numbers = new int[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			int r = (int) (Math.random() * 100); //랜덤함수 random(): 0~1 사이의 난수 생성
			numbers[i] = r; // 배열을 랜덤한 수로 초기화함
		}
		
		System.out.print("최초의 리스트: ");
		for (int r : numbers)
			System.out.print(r + " ");
		Arrays.sort(numbers); //배열에 저장된 숫자를 크기순으로 정렬함
		
		System.out.print("\n정렬된 리스트: ");
		for (int r : numbers)
			System.out.print(r + " ");
	}

}
