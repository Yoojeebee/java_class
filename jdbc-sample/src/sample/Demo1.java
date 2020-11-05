package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @FileName : Demo1.java
 * @Project : jdbc-sample
 * @author	:user
 * @Date	:2020. 11. 5.
 * @Time    :오후 3:35:27
 */
public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Oracle jdbc 드라이버를 JVM 메모리에 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		
		// 2. DBMS 연결에 필요한 url, username, password를 전달받아서
		//    DBMS와의 연결을 담당하는 객체를 획득
		// jdbc:oracle:thin -> jdbc 드라이브의 종류
		// @localhost 		-> DBMS가 실행되는 컴퓨터의 이름 혹은 ip주소
		// 1521				-> Oracle DBMS가 사용하는 컴퓨터의 port번호
		// xe				-> DBMS의 고유한 식별 아이디
		String url = "jdbc:oracle:thin:@localhost:4:xe";
		String user = "hta";
		String password = "zxcv1234";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println("커넥션객체: " + connection);
		
		// 들어갈 값에 ?를 적는다.(어떠한 값을 보낼지 아직 정하지 않음)
		String SQL = "delete from sample_books where book_no = ?";
		
		// 3. SQL을 DBMS로 전송하고, 실행결과를 받아오는 객체 획득
		PreparedStatement pstmt = connection.prepareStatement(SQL);
		
		// 4. SQL의 ?를 실제값으로 대체시키기(1001)
		pstmt.setInt(1, 1001);
		
		
		// 5. SQL을 DBMS로 전송하고 실행결과 받아오기
		pstmt.executeUpdate();
		
		// 6. 사용했던 모든 연결 끊기
		pstmt.close();
		connection.close();
	}
}
