package kr.co.hta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.hta.util.ConnectionUtil;
import kr.co.hta.vo.Gogak;

public class GogakDao {

	private static final String SELECT_ALL_GOGAK = "SELECT * FROM GOGAK";
	
	public GogakDao() { super(); }
	
	public List<Gogak> selectAllGogak() throws SQLException {
		List<Gogak> gogaks = new ArrayList<Gogak>();
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(SELECT_ALL_GOGAK);
		ResultSet result = pstmt.executeQuery();
		
		while(result.next()) {
			Gogak gogak = new Gogak();
			gogak.setGno(result.getInt("GNO"));
			gogak.setGname(result.getString("GNAME"));
			gogak.setJumin(result.getString("JUMIN"));
			gogak.setPoint(result.getInt("POINT"));

			gogaks.add(gogak);
		}
		
		connection.close();
		pstmt.close();
		result.close();
		
		return gogaks;
	}
	
}
