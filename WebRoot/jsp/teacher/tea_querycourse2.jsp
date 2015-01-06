<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body bgcolor=#cdf2e3>
	<center><font size="+1" color="red">${msg7 }</font></center>
	<c:if test="${msg7==null}">
  	<form action="/EduSystem/servlet/Tea_ExportScoreServlet" method="post">
  		<table width="1000" height="200" align="center" border="1" cellpadding="3">
			  <tr bgcolor="#B0E0E6">
			    <td colspan="5"> �γ���Ϣ���£�</td>
			  </tr>
			  <tr bgcolor="#F0FFF0">
			    <td><div align="center">�γ̱��</div></td>
			    <td><div align="center">�γ����</div></td>
			    <td><div align="center">ѧ��ѧ��</div></td>
			    <td><div align="center">ѧ������</div></td>
			    <td><div align="center">����</div></td>
			  </tr>
  		 <c:forEach items="${scores}" var="score">
	  		<tr bgcolor="#F0FFF0">
			    <td><div align="center">${score.courseno }<input type="hidden" name="courseno" value="${score.courseno }"></div></td>
			    <td><div align="center">${score.coursename }</div></td>
			    <td><div align="center">${score.stuno }</div></td>
			    <td><div align="center">${score.stuname }</div></td>
			    <td>
			    	<c:choose>
				 		<c:when test="${score.score==0 }">
	  					<div align="center">δ�Ƿ�</div>
	  			  		</c:when>
	  			  		<c:otherwise>
	  			  	       <c:choose>
	  			  	          <c:when test="${score.operation==null||score.operation=='�ݴ�'}">
	  					      <div align="center"><input type="text" name="score" value="${score.score }"></div>
	  				          </c:when>
	  				          <c:when test="${score.operation=='�ύ'}">
	  					      <div align="center">${score.score }</div>
	  				          </c:when>
	  				       </c:choose>
	  			  	    </c:otherwise>
	  			  	</c:choose>
	  			</td> </tr>
	  		</c:forEach>
	  		<tr bgcolor="#B0E0E6">
	       		<td colspan="6"><div align="center"><input type="submit" value="������PDF�ļ�"></div></td>
	    	</tr>
  	      </table>
	   </form>
	</c:if>
</body>
</html>