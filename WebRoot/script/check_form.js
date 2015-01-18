$(function() {
	$("#user").val("请输入用户名");
	$("#pwd").css("color", "gray");
	$("#user").css("color", "gray");
	$("#vcode").css("color", "gray");
	$("#user").focus(function() {
		if ($("#user").val() == "请输入用户名") {
			$("#user").val("");
			$("#user").css("color", "gray");
		}
	});

	$("#pwd").focus(function() {
		if ($("#pwd").val() == "请输入密码") {
			$("#pwd").val("");
			document.getElementById("pwd").type = "password";
			$("#pwd").css("color", "gray");
		}
	});

	$("#user").blur(function() {
		if ($("#user").val() == "") {
			$("#user").val("请输入用户名");
			$("#user").css("color", "gray");
		}
	});

	$("#pwd").blur(function() {
		if ($("#pwd").val() == "") {
			document.getElementById("pwd").type = "text";
			$("#pwd").val("请输入密码");
			$("#pwd").css("color", "gray");
		}
	});
	
	$("#imgvcode").attr("src", "./res/code/code.jsp?num="+Math.random() * 10000);
	$("#vcode").focus(function() {
		if ($("#vcode").val() == "请输入验证码") {
			$("#vcode").val("");
			$("#vcode").css("color", "gray");
		}
		$("#imgvcode").attr("class", "imgvcodeshow");
		$("#imgvcode").attr("src", "./res/code/code.jsp?num="+Math.random() * 10000);
	});
	
	$("#vcode").blur(function() {
		if ($("#vcode").val() == "") {
			$("#vcode").val("请输入验证码");
			$("#vcode").css("color", "gray");
		}
		$("#imgvcode").attr("class", "imgvcodehidden");
	});
	
	$("#login_btn").click(function () {
		$("#form1").submit();
	});
});
