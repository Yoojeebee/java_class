# 2020-10-28-수요일
  
### Enhanced for문에서 데이터 삭제
[Iterator 예제](https://github.com/yoojeebee/api/collection/iterator/EnhancedForDemo.java)
```java
ArrayList<String> names = new ArrayList<String>();
names.add("이순신");
names.add("김유신");
names.add("강감찬");
names.add("류관순");
		
for(String name : names) {
	names.remove(0);
}

==== 실행 결과 ====
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
	at collection.iterator.EnhancedForDemo.main(EnhancedForDemo.java:14)
```
Enhanced for문에서는 콜렉션(ArrayList)의 요소를 삭제하면 오류가 발생
<br/>
<br/>  
## 저장된 데이터(객체, 레코드)에 대한 반복처리를 지원하는 API
- 반복작업을 지속할 지 여부를 알려주는 메소드
- 다음 데이터를 꺼내는 메소드가 있다
- for문보다는 while문을 사용해서 반복작업을 수행하는 것이 편하다

```java
Iterator<E>
	boolean hasNext()	// 조회할 요소가 남아있으면 true 반환
	E next()		// 객체를 꺼낸다
	void remove()		

Enumeration<E>
	boolean hasMorElements()	// 조회할 요소가 남아있으면 true 반환
	E nextElement()			// 객체를 꺼낸다
	
StringTokenizer
	boolean hasMoreTokens()	// 조회할 토큰이 남아있으면 true 반환
	String nextToken()	// 토큰을 꺼낸다

ResultSet
	boolean next()		// 조회할 행(row, recode)이 남아있으면 true 반환
	xxxgetXXX(String name)	// 현재 행에서 지정된 이름의 값을 가져온다
```
[Iterator 예제1](https://github.com/Yoojeebee/java_class/blob/master/api/src/collection/iterator/IteratorDemo1.java)
<br/>
[Iterator 예제2](https://github.com/Yoojeebee/java_class/blob/master/api/src/collection/iterator/IteratorDemo2.java)