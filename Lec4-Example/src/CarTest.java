
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.color = "red";
		myCar.gear = 2;
		myCar.speed = 80;
		
		myCar.changeGear(5);
		myCar.speedUp(20);
		myCar.speedDown(15);
		
		System.out.println(myCar.toString());
	}

}
