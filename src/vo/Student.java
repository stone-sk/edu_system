package vo;
/** 
 * 文件名:       Course.java 
 * CopyRright(c)  2010-08 
 * 创 建 人：       王昭阳
 * 日    期：    2010-08-08 
 * 描    述：    负责存取学生的相关信息
 * 版 本 号：        V1.0
 */
public class Student {
	
	private String stuno;//学号
	private String password;//密码
	private String stuname;//姓名
	private String stusex;//性别
	
	/*各个变量对应的getter和setter方法*/
	public String getStusex() {
		return stusex;
	}
	public void setStusex(String stusex) {
		this.stusex = stusex;
	}
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	
}
