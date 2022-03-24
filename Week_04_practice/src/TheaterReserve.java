import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size = 10;
		int[] seats = new int[size];
		
		while(true) {
			System.out.println("----------------------------------");
			for(int i = 0; i < size; i++)
				System.out.printf("%d ", i+1);
			System.out.println("\n----------------------------------");
			for (int i = 0; i < seats.length; i++)
				System.out.printf("%d ",seats[i]);
			System.out.println("\n----------------------------------");
			System.out.print("원하시는 좌석번호를 입력하세요(종료: -1): ");
			Scanner input = new Scanner(System.in);
			int seatNum = input.nextInt();
			if (seatNum == -1)
				break;
			if (seats[seatNum - 1] == 0) {
				seats[seatNum - 1] = 1;
				System.out.println("예약되었습니다.");
			} else {
				System.out.println("이미 예약된 자리입니다.");
			}
		}
	}

}
