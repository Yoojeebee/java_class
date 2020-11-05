package kr.co.hta.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 데이터베이스 액세스 작업에 필수적으로 필요한 Connection객체를 제공하는 기능이 포함된 클래스다
 * @FileName : ConnectionUtil.java
 * @Project : jdbc-sample
 * @author	:user
 * @Date	:2020. 11. 5.
 * @Time    :오후 4:18:03
 */
public class ConnectionUtil {
	
	// static 초기화 블록
	// ConnectionUtil 클래스(설계도)가 메모리에 로딩되는 즉시 실행
	// 단 한번만 실행된다
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 상수 정의(url, user, password)
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:49161:xe";
	private static final String USER_NAME = "hta";
	private static final String USER_PASSWORD = "zxcv1234";
	
	/**
	 * DBMS와 연결을 유지하는 Connection객체를 반환한다.
	 * @return DBMS와의 연결을 책임지는 Connection 객체
	 * @throws SQLException url, 아이디, 비밀번호가 틀리면 예외발생
	 */
	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(DB_URL, USER_NAME, USER_PASSWORD);
		return connection;
	}
	
}
