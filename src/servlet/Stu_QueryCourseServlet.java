package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Student;
import dao.CourseDao;

@SuppressWarnings({"rawtypes"})
public class Stu_QueryCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 181089912795608108L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		Student stu = (Student)request.getSession().getAttribute("student");
		CourseDao cdao = new CourseDao();
		
		try{
			ArrayList selectedcourses = cdao.getCourseByStuno(stu.getStuno());//获取该生选修好的课程
			if(selectedcourses.size()==0){
				request.setAttribute("msg4", "对不起,您还没有选课!");
			}
			else{
				request.setAttribute("msg4", null);
				request.setAttribute("selectedcourses",selectedcourses);	
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/student/stu_querycourse.jsp");
			dispatcher.forward(request, response); //内部跳转，将处理信息存储在request中
		}catch(Exception ex){	ex.printStackTrace();}
	}
}
