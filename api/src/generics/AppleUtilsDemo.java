package generics;

public class AppleUtilsDemo {
	public static void main(String[] args) {
		String[] arr1 = {"강감찬", "김유신", "이순신"};
		ArrayUtils.printArray(arr1);
		
		Apple[] arr2 = {
			new Apple("빨간사과", "홍옥"),
			new Apple("맛있는 사과", "부사")
		};
		ArrayUtils.printArray(arr2);
		
	}
}
