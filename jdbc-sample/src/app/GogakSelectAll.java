package app;

import java.sql.SQLException;
import java.util.List;

import kr.co.hta.dao.GogakDao;
import kr.co.hta.vo.Gogak;


public class GogakSelectAll {
	public static void main(String[] args) throws SQLException {
		GogakDao gogakDao = new GogakDao();
		List<Gogak> gogaks = gogakDao.selectAllGogak();
		StringBuilder sb = new StringBuilder();
		for(Gogak gogak : gogaks) {
			sb.append(gogak.getGno()+", ").append(gogak.getGname()+", ").append(gogak.getJumin()+", ").append(gogak.getPoint());
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
}
