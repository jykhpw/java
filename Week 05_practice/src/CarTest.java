
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("S600", "white", 80); // ù ��° ������ ȣ��
		Car c2 = new Car("E500", "blue", 20); // �� ��° ������ ȣ��
		
		int n = Car.getNumberOfCars(); // ���� ����
		System.out.println("���ݱ��� ������ �ڵ����� �� =" + n);
	}

}
