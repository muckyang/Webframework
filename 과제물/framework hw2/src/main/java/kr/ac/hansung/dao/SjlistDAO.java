package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Sjlist2;

@Repository // 자동으로 bean 등록
public class SjlistDAO {

	private JdbcTemplate jdbcTemplateObject;
	private DataSource dataSource;
	
	@Autowired //property 자동으로 등록
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	// 존재하는 레코드 수 리턴
	public int getRowCount(){
		String sqlStatement ="select count(*) from sjlist2";
		return jdbcTemplateObject.queryForObject(sqlStatement,Integer.class);//int형 타입으로 가져옴
	}
	
	//레코드 읽어서 object로 리턴	
	public Sjlist2 getSubject(String name){
		String sql = "select * from sjlist2 where sjcode = ?";  
		
		return jdbcTemplateObject.queryForObject(sql,new Object[]{name},
				new RowMapper<Sjlist2>(){ // record를 읽어 객체에 저장
					public Sjlist2 mapRow(ResultSet rs, int rowNum) throws SQLException {
						
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
				
		});
	}
	//여러개 리턴
	public List<Sjlist2> getSubjects(){
		String sql = "select * from sjlist2";  
		
		return jdbcTemplateObject.query(sql,
				new RowMapper<Sjlist2>(){ // record를 읽어 객체에 저장
					public Sjlist2 mapRow(ResultSet rs, int rowNum) throws SQLException {
					
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
				
		});
	}

	//1학기 쿼리문
	public List<Sjlist2> getSubjectweights1(String year){
		String sql = "select * from sjlist2 where year=? and semester=1";  
		return jdbcTemplateObject.query(sql,new Object[]{year},
				new RowMapper<Sjlist2>(){ // record를 읽어 객체에 저장
					public Sjlist2 mapRow(ResultSet rs, int rowNum) throws SQLException {
					
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
				
		});
	}
	//2학기 쿼리문
	public List<Sjlist2> getSubjectweights2(String year){
		String sql = "select * from sjlist2 where year=? AND semester ='2'";  
		return jdbcTemplateObject.query(sql,new Object[]{year},
				new RowMapper<Sjlist2>(){ // record를 읽어 객체에 저장
					public Sjlist2 mapRow(ResultSet rs, int rowNum) throws SQLException {
					
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
				
		});
	}
	//새로 수강신청한것 쿼리문
	public List<Sjlist2> getSubjectup(){
		String sql = "select * from sjlist2 where year='2017' AND semester ='1'";  
		return jdbcTemplateObject.query(sql,
				new RowMapper<Sjlist2>(){ // record를 읽어 객체에 저장
					public Sjlist2 mapRow(ResultSet rs, int rowNum) throws SQLException {
					
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
				
		});
	}
	
	public boolean insert(Sjlist2 list){
		String year = list.getYear();
		String semester = list.getSemester();
		String sjcode = list.getSjcode();
		String sjname = list.getSjname();
		String sjtype = list.getSjtype();
		int sjweight = list.getSjweight();
		String sql = "insert into sjlist2 (year ,semester,sjcode,sjname,sjtype,sjweight) values(?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sql,new Object[]{year,semester,sjcode,sjname,sjtype,sjweight})==1);
	}
	

}
