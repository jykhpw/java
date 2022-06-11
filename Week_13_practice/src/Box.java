
public class Box {

	private Object data;
	public void set(Object data) { this.data= data; }	
	public Object get() { return data; }
	
	public static void main(String[] args) {
		// 12 - p.4 ���׸� Ŭ���� ���� (Box Ŭ���� - ���׸� Ŭ���� �̿� X)
		Box b = new Box();
		b.set("Hello World!");	// 1) ���ڿ� ��ü�� ����
		String s = (String)b.get();  // 2) Object Ÿ���� String Ÿ������ ����ȯ
		b.set(new Integer(10)); 	// 3) ���� ��ü�� ����
		Integer i = (Integer)b.get(); 	// 4) Object Ÿ���� Integer Ÿ������ �� ��ȯ
		
		// 12 - p.5 ���׸� Ŭ���� ���� (Box1 Ŭ���� - ���׸� Ŭ���� �̿� O)
		Box1<String> b1 = new Box1<String>();
		Box1<Integer> b2 = new Box1<Integer>();
		b1.set("Hello World!");
		String s1 = (String) b1.get();
		b2.set(new Integer(10));
		Integer i1 = (Integer) b2.get();
	}

}

class Box1<T> {
	private T data;
	public void set(T data) { this.data = data; }
	public T get() { return data; }
}