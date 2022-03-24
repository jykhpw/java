
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television(); // 객체를 생성함
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true; // 객체의 멤버에 접근할 때는 클래스명과 필드명 사이에 멤버 연산자(.)를 사용함
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.println("나의 텔레비전의 채널은 " + myTv.channel + "이고, 볼륨은 " +
				myTv.volume + "입니다.");
		System.out.println("너의 텔레비전의 채널은 " + yourTv.channel + "이고, 볼륨은 " +
				yourTv.volume + "입니다.");
	}

}
