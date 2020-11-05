package kr.co.hta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.hta.util.ConnectionUtil;
import kr.co.hta.vo.Dept;

public class DeptDao {

	private Dept dept;
	
	private static final String SELECT_ALL_DEPT2 = "SELECT * FROM DEPT2";
	
	public DeptDao() { super(); }
	
	public List<Dept> selectAllDept() throws SQLException {
		List<Dept> depts = new ArrayList<Dept>();
		
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(SELECT_ALL_DEPT2);
		ResultSet result = pstmt.executeQuery();
		
		while(result.next()) {
			dept = new Dept();
			dept.setDcode(result.getNString("DCODE"));
			dept.setDname(result.getNString("DNAME"));
			dept.setPdept(result.getNString("PDEPT"));
			dept.setArea(result.getNString("AREA"));
			
			depts.add(dept);
		}
		
		connection.close();
		pstmt.close();
		result.close();
		
		return depts;
	}
}
