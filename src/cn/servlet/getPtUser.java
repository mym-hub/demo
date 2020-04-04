package cn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.entity.PtUser;
import cn.hibernateDao.loginDao;

@WebServlet("/getPtUser")
public class getPtUser extends HttpServlet {
    public getPtUser() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		loginDao dao=new loginDao();
		List<PtUser> list=dao.getPtUser();
		HttpSession session =request.getSession();
		session.setAttribute("userlist", list);
	}
}
