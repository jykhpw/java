
public class Lec3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime;
		
		for (int i = 1; i <= 1000; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.printf("%d ", i);
		}	
	}
}
