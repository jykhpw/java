
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("S600", "white", 80); // 첫 번째 생성자 호출
		Car c2 = new Car("E500", "blue", 20); // 두 번째 생성자 호출
		
		int n = Car.getNumberOfCars(); // 정적 변수
		System.out.println("지금까지 생성된 자동차의 수 =" + n);
	}

}
