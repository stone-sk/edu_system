package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import vo.Course;

@SuppressWarnings({"rawtypes", "unchecked"})
public class CourseDao {
	private Connection conn = null;
	public void initConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String host = "localhost";
		String port = "3306";
		String url = "jdbc:mysql://" + host + ":" + port +"/edu_system";
		String dbuser = "root";
		String dbpwd = "1234"; 
		conn = DriverManager.getConnection(url, dbuser, dbpwd);
	}
	public ArrayList getAllCoursename() throws Exception{//获得所有课程名称
		ArrayList al = new ArrayList();
		this.initConnection();
		String sql = "select distinct(coursename) from t_course";
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()){
			al.add(rs.getString("coursename").trim());
		}
		this.closeConnection();
		return al;
	}
	public ArrayList getAllCourse() throws Exception{//获得所有课程
		ArrayList al = new ArrayList();
		this.initConnection();
		String sql = "select * from t_course A join t_teacher B on A.teano = B.teano";
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()){
			Course cou = new Course();
			cou.setCourseno(rs.getString("courseno").trim());
			cou.setCoursename(rs.getString("coursename").trim());
			cou.setCredit(rs.getFloat("credit"));
			cou.setTeano(rs.getString("teano").trim());
			cou.setTeaname(rs.getString("teaname").trim());
			al.add(cou);
		}
		this.closeConnection();
		return al;
	}
	public Course getCourseByCourseno(String courseno) throws Exception{//根据课程号获取课程信息
		this.initConnection();
		Course cou = null;
		String sql = "select * from t_course A join t_teacher B on A.teano = B.teano where A.courseno='"+courseno+"'";
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		if(rs.next()){
			cou = new Course();
			cou.setCourseno(courseno);
			cou.setCoursename(rs.getString("coursename").trim());
			cou.setCredit(rs.getFloat("credit"));
			cou.setTeano(rs.getString("teano").trim());
			cou.setTeaname(rs.getString("teaname").trim());
		}
		this.closeConnection();
		return cou;
	}
	public ArrayList getCourseByTeano(String teano) throws Exception{//获得相应职工号的开课情况
		ArrayList al = new ArrayList();
		this.initConnection();
		String sql = "select * from t_course A join t_teacher B on A.teano = B.teano where B.teano='"+teano+"'";;
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()){
			Course cou = new Course();
			cou.setCourseno(rs.getString("courseno").trim());
			cou.setCoursename(rs.getString("coursename").trim());
			cou.setCredit(rs.getFloat("credit"));
			cou.setTeano(teano);
			cou.setTeaname(rs.getString("teaname").trim());
			al.add(cou);
		}
		this.closeConnection();
		return al;
	}
	public ArrayList getCourseByStuno(String stuno) throws Exception{//获得相应学号选修好的课程
		ArrayList al = new ArrayList();
		this.initConnection();
		String sql = "select * from t_course A join t_score B on A.courseno=B.courseno join t_teacher C on A.teano=C.teano" 
			+" where B.stuno='"+stuno+"'";
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()){
			Course cou = new Course();
			cou.setCourseno(rs.getString("courseno").trim());
			cou.setCoursename(rs.getString("coursename").trim());
			cou.setCredit(rs.getFloat("credit"));
			cou.setTeano(rs.getString("teano").trim());
			cou.setTeaname(rs.getString("teaname").trim());
			al.add(cou);
		}
		this.closeConnection();
		return al;
	}
	public void closeConnection() throws Exception{
		conn.close();
	}
}
