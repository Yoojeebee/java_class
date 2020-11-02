package collection.map;

public class Iphone implements Phone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("페이스타임으로 영상통화를 합니다.");
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("iMessage로 문자를 주고받습니다.");
	}
	
}
