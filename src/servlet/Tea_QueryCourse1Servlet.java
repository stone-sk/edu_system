package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Teacher;
import dao.CourseDao;

@SuppressWarnings({"rawtypes"})
public class Tea_QueryCourse1Servlet extends HttpServlet {
	private static final long serialVersionUID = -8049400505632850963L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		Teacher tea = (Teacher)request.getSession().getAttribute("teacher");
		CourseDao cdao = new CourseDao();
		
		try{
			ArrayList courses = cdao.getCourseByTeano(tea.getTeano());//获取教师开设的所有课程
			if(courses.size()!=0){
				request.setAttribute("courses",courses);
			}
			request.getRequestDispatcher("/jsp/teacher/tea_querycourse1.jsp").forward(request, response);//内部跳转
		}catch(Exception ex){	ex.printStackTrace();}
	}
}
