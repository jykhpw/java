
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
	}

}
