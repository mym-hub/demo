<%@page import="cn.hibernateDao.loginDao"%>
<%@page import="cn.entity.PtUser"%>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>首页</title>
</head>
<body>
	登录成功！
	欢迎您！
	<%
	response.setHeader("Catch-Control","no-store");
	response.setHeader("Pramga","no-catch");
	response.setDateHeader("Expires",0);
		String name=(String)session.getAttribute("uname");
		if(name!=null)
			out.print(name+"<br/>");
		else
			response.sendRedirect("login.jsp");
	%>
	<%!
		List<PtUser> list;
	%>
	<%
		loginDao dao=new loginDao();
		list=dao.getPtUser();
		for(PtUser user:list)
			out.println(user.toString()+"<br/>");
		
	%>
	<c:foreach items="${list}" var="user" varStatus="status">
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.startdata}</td>
			<td>${user.enddata}</td>
			<td>${user.selery}</td>
			<td>${user.addr}</td>
			<td>${user.phone}</td>
			<td>${user.test}</td>
		</tr>
	</c:foreach>
</body>
</html>