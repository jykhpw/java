
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television(); // ��ü�� ������
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true; // ��ü�� ����� ������ ���� Ŭ������� �ʵ�� ���̿� ��� ������(.)�� �����
		myTv.print();
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print();
		
	}

}
