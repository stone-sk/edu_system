<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>教务管理管理系统——主界面</title>
		<style type="text/css">
			div.content {
				position: absolute;
				top: 100px;
				left: 0px;
				width: 500px;
				height: 375px;
				background: url(./images/login-form.png);
				z-index: 100;
			}
			
			div.content table {
				width: 200px;
				padding: 0px;
				margin: 0px;
				position: absolute;
				left: 128px;
				bottom: 40px;
			}
			
			div.content td {
				height: 50px;
			}
			
			#login_btn:hover {
				cursor: pointer;
			}
			
			td input {
				height: 40px;
				width: 170px;
				border: none;
			}
		</style>
		<script src="./script/jquery.js" type="text/javascript"></script>
		<script src="./script/check_form.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="content">
			<table width="90%" align="center" class="tablelist">
				<tr>
					<td align="center"><input type="text" value="请输入用户名" id="user" /></td>
				</tr>
				<tr>
					<td align="center"><input type="text" value="请输入密码" id="pwd" /></td>
				</tr>
				<tr>
					<td align="center">
						<img src="./images/login-btn.png" alt="登录按钮" id="login_btn" />
					</td>
				</tr>
			</table>
		</div>
  </body>
</html>
