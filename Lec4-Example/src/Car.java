
public class Car {
	// Car Ŭ������ �ʵ�
	String color; // ����
	int gear; // ���� ���
	int speed; // ���� �ӵ� (����: km/h)
	
	// Car Ŭ������ �޼ҵ�
	void changeGear(int g) { // ��� �ٲٱ�
		gear = g;
	}
	void speedUp(int spu) { // �����ϱ�
		speed += spu;
	}
	void speedDown(int spd) { // �����ϱ�
		speed -= spd;
	}
	
	public String toString() { // Car Ŭ������ �ʵ带 ����ϴ� �޼ҵ�
		return "Car [ color = " + color + ", speed = " + speed + ", gear = " + gear + "]";
	}
}
