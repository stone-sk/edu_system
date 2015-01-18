<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.util.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="dao.TeacherDao"%>
<%@page import="vo.Teacher"%>
<%@page import="dao.CourseDao"%>
<%@page import="vo.Course"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body bgcolor=#cdf2e3>
   <center><font size="+1" color="red">${msg8}</font></center>	
   <c:if test="${msg8==null}">
   	  <br><br>	
   	  <center><img src="${chartUri }"></center>
   </c:if>
</body>
</html>