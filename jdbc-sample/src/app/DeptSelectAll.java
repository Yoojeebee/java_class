package app;

import java.sql.SQLException;
import java.util.List;

import kr.co.hta.dao.DeptDao;
import kr.co.hta.vo.Dept;

public class DeptSelectAll {

	public static void main(String[] args) throws SQLException {
		DeptDao deptDao = new DeptDao();
		List<Dept> depts = deptDao.selectAllDept();
		StringBuilder sb = new StringBuilder();
		for(Dept dept : depts) {
			sb.append(dept.getDcode()+", ").append(dept.getDname()+", ").append(dept.getPdept()+", ").append(dept.getArea());
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
	
}
