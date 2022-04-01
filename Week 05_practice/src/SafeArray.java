
public class SafeArray {
	private int[] a;
	public int length;
	
	public SafeArray(int length){
		this.a = new int[length];
		this.length = length;
	}
	
	public int get(int index) {
		if (index >= 0 && index < this.length) {
			return a[index];
		}
		return -1;
	}
	public void put(int index, int value) {
		if (index >= 0 && index < this.length) {
			this.a[index] = value;
		} else {
			System.out.println("잘못된 인덱스 " + index);
		}
	}
}
