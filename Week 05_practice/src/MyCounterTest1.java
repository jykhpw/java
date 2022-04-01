
public class MyCounterTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCounter obj = new MyCounter();
		
		System.out.println("obj.value = "+ obj.value);
		obj.inc(obj);
		System.out.println("obj.value = "+ obj.value);
	}

}
