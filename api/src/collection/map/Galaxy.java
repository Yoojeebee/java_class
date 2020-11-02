	package collection.map;
	
	public class Galaxy implements Phone {
	
		@Override
		public void call() {
			// TODO Auto-generated method stub
			System.out.println("통화내용을 녹음합니다.");
		}
	
		@Override
		public void sms() {
			// TODO Auto-generated method stub
			System.out.println("녹음내용을 문자로 변환해서 보냅니다.");
		}
	
	}
