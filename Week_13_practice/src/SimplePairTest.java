
public class SimplePairTest {

	public static void main(String[] args) {
		// 12 - p.7 제네릭 클래스 - SimplePair 클래스 작성하기 예제
		SimplePair<String> pair = new SimplePair<String>("apple", "tomato");
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
	}
}

class SimplePair<T> {
	private T firstData;
	private T secondData;
	public SimplePair (T firstData, T secondData) {
		this.firstData = firstData;
		this.secondData = secondData;
	}
	
	// get
	public T getFirst() { return firstData; }
	public T getSecond() { return secondData; }
	
	// set
	public void setFirst(T firstData) { this.firstData = firstData; }
	public void setSecond(T secondData) { this.secondData = secondData; }
}
