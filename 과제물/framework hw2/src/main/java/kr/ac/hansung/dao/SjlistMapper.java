package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.Sjlist2;

public class SjlistMapper implements RowMapper<Sjlist2> {

	@Override
	public Sjlist2 mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Sjlist2 list2 = new Sjlist2();

		list2.setPid(rs.getInt("pid"));
		list2.setYear(rs.getString("year"));
		list2.setSemester(rs.getString("semester"));
		list2.setSjcode(rs.getString("sjcode"));
		list2.setSjname(rs.getString("sjname"));
		list2.setSjtype(rs.getString("sjtype"));
		list2.setSjweight(rs.getInt("sjweight"));

		return list2;
	}

}
