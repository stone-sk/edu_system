package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import vo.Student;
public class StudentDao {
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
	public Student getStudentByStuno(String stuno) throws Exception{//通过学号获得学生信息
		Student stu = null;//attention！
		this.initConnection();
		Statement stat = conn.createStatement();
		String sql = "select * from t_student where stuno='"+stuno+"'";
		ResultSet rs = stat.executeQuery(sql);
		if(rs.next()){
			stu = new Student();
			stu.setStuno(stuno);
			stu.setPassword(rs.getString("stupwd").trim());
			stu.setStuname(rs.getString("stuname").trim());	
			stu.setStusex(rs.getString("stusex").trim());
		}
		this.closeConnection();
		return stu;		
	}
	public void updateStudent(Student stu) throws Exception{//修改学生信息
		this.initConnection();
		String sql = "update t_student set stupwd=? where stuno=?";
		PreparedStatement ps = conn.prepareStatement(sql);		
		ps.setString(1, stu.getPassword());
		ps.setString(2, stu.getStuno());
		ps.executeUpdate();
		this.closeConnection();
	}
	public void closeConnection() throws Exception{
		conn.close();
	}
}
