package vo;
/** 
 * 文件名:       Course.java 
 * CopyRright(c)  2010-08 
 * 创 建 人：       王昭阳
 * 日    期：    2010-08-08 
 * 描    述：    负责存取考试成绩的相关信息
 * 版 本 号：        V1.0
 */
public class Score {
	
	private String stuno;//学号
	private String stuname;//姓名
	private String courseno;//课程号
	private String coursename;//课程名称
	private String type;//考试类型（“期中”或者“期末”）
	private float score;//分数
	private String state;//状态（教师可以选择“暂存”或者“提交”录入的成绩，不同的操作对应不同的状态）
	
	/*各个变量对应的getter和setter方法*/
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getCourseno() {
		return courseno;
	}
	public void setCourseno(String courseno) {
		this.courseno = courseno;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
