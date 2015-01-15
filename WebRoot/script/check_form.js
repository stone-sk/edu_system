$(function() {
	$("#user").val("请输入用户名");
	$("#pwd").css("color", "gray");
	$("#user").css("color", "gray");
	$("#user").focus(function() {
		if ($("#user").val() == "请输入用户名" || $("#user").val() == "用户名不存在!") {
			$("#user").val("");
			$("#user").css("color", "gray");
		}

		if ($("#user").val() == "必须为5到19位的英文和数字") {
			$("#user").val("");
			$("#user").css("color", "gray");
		}
	});

	$("#pwd").focus(function() {
		if ($("#pwd").val() == "请输入密码") {
			$("#pwd").val("");
			document.getElementById("pwd").type = "password";
		}

		if ($("#pwd").val() == "必须为5到19位的英文和数字" || $("#pwd").val() == "密码错误！") {
			document.getElementById("pwd").type = "password";
			$("#pwd").val("");
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
});
