<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="vo.Student"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="/EduSystem/css/style.css">
	</head>
	<body bgcolor="#cdf2e3">
		<table width="100%" height="100%" border="1">
			<tr height="10%"><td colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="/EduSystem/images/logo.png"/><span style="padding:0px;margin:0px;"><font size=9>教务系统欢迎您</font></span></td></tr>
			<tr>
				<td height="10%" width="10%" align="center"><a href="/EduSystem/servlet/Stu_SelectCourseServlet" target="iframe1" style=text-decoration:none>网上选课</a></td>
				<td rowspan="8"><iframe width="100%" height="100%" name="iframe1" frameborder="0" src="/EduSystem/jsp/right.jsp"></iframe></td>
			</tr>
			<tr height="10%"><td width="10%" align="center"><a href="/EduSystem/servlet/Stu_QueryCourseServlet" target="iframe1" style=text-decoration:none>选课结果</a></td></tr>
			<tr height="10%"><td width="10%" align="center"><a href="/EduSystem/servlet/Stu_QueryScoreServlet" target="iframe1" style=text-decoration:none>学生成绩</a></td></tr>
			<tr height="10%"><td width="10%" align="center"><a href="/EduSystem/jsp/modifyPwd.jsp" target="iframe1" style=text-decoration:none>修改密码</a></td></tr>
			<tr height="10%"><td width="10%" align="center"><a href="stu_ope.jsp" style=text-decoration:none>培养方案</a></td></tr>
			<tr height="10%"><td width="10%" align="center"><a href="stu_ope.jsp" style=text-decoration:none>论 坛</a></td></tr>
			<tr height="10%"><td width="10%" align="center"><a href="/EduSystem/servlet/LogoutServlet" style=text-decoration:none>退 出</a></td></tr>
			<tr height="10%"><td>&nbsp;</td></tr>
			<tr height="5%"><td colspan="2">
			<pre style="display:inline"><font color="#556B2F">    ${type }：[${student.stuno}] ${student.stuname }                                                                                          Copyright (C) GoodEdu 2014-2014, All Rights Reserved</font></pre>
			</td></tr>
		</table>
	</body>
</html>