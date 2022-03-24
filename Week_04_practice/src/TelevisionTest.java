
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television(); // 객체를 생성함
		myTv.setChannel(11);
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");
		/*myTv.print();
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print();*/
		
	}

}
