
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television(); // ��ü�� ������
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true; // ��ü�� ����� ������ ���� Ŭ������� �ʵ�� ���̿� ��� ������(.)�� �����
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.println("���� �ڷ������� ä���� " + myTv.channel + "�̰�, ������ " +
				myTv.volume + "�Դϴ�.");
		System.out.println("���� �ڷ������� ä���� " + yourTv.channel + "�̰�, ������ " +
				yourTv.volume + "�Դϴ�.");
	}

}
