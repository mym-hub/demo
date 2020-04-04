<%@page import="org.apache.struts2.interceptor.CookiesAware"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录</title>
</head>
<body>
	<%
		String tip=null;
		tip=(String)request.getAttribute("tip");
		if(tip!=null)
		{
			out.print("<script>alert('"+tip+"'); </script>");
			tip=null;
		}
	%>
	<form action="check.jsp" method="post">
		姓名：<input type="text" name="uname" /><br/><br/>
		密码：<input type="password" name="password" /><br/><br/>
		<input type="submit" value="登录"/>
		<input type="reset" value="重置"/>
	</form>
</body>
</html>