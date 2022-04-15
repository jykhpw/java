
public class Child extends Parent{
	public void print() {
		super.print();
		System.out.println("자식 클래스의 print() 메소드");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.print();
	}

}
