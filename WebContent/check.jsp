<%@page import="cn.hibernateDao.loginDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%

	request.setCharacterEncoding("utf-8");
	String uname=request.getParameter("uname");
	String pwd=request.getParameter("password");
	loginDao dao=new loginDao();
	int flag=dao.Userlogin(uname, pwd);
	if(flag==1)
	{
		session.setAttribute("uname", uname);
		session.setAttribute("pwd", pwd);
		session.setMaxInactiveInterval(30*60);
		Cookie cookie=new Cookie("uname", uname);
		response.addCookie(cookie);
		response.sendRedirect("success.jsp");
	}
	else{
		request.setAttribute("tip", "用户名或密码错误！");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
%>

</body>
</html>