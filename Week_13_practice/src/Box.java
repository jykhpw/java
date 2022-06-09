
public class Box {

	private Object data;
	public void set(Object data) { this.data= data; }	
	public Object get() { return data; }
	
	public static void main(String[] args) {
		// 12 - p.4 제네릭 클래스 예제 (Box 클래스 - 제네릭 클래스 이용 X)
		Box b = new Box();
		b.set("Hello World!");	// 1) 문자열 객체를 저장
		String s = (String)b.get();  // 2) Object 타입을 String 타입으로 형변환
		b.set(new Integer(10)); 	// 3) 정수 객체를 저장
		Integer i = (Integer)b.get(); 	// 4) Object 타입을 Integer 타입으로 형 변환
	}

}
