
public class Car {
	// Car 클래스의 필드
	String color; // 색상
	int gear; // 현재 기어
	int speed; // 현재 속도 (단위: km/h)
	
	// Car 클래스의 메소드
	void changeGear(int g) { // 기어 바꾸기
		gear = g;
	}
	void speedUp(int spu) { // 가속하기
		speed += spu;
	}
	void speedDown(int spd) { // 감속하기
		speed -= spd;
	}
	
	public String toString() { // Car 클래스의 필드를 출력하는 메소드
		return "Car [ color = " + color + ", speed = " + speed + ", gear = " + gear + "]";
	}
}
