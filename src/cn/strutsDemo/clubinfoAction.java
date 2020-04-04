package cn.strutsDemo;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.Club;
import cn.hibernateDao.ClubDao;

public class clubinfoAction extends ActionSupport {
@Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
	HttpServletRequest request=ServletActionContext.getRequest();
	HttpServletResponse response=ServletActionContext.getResponse();
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=utf-8");
	response.setHeader("Access-Control-Allow-Origin", "*");
	response.setHeader("Access-Control-Allow-Methods", "GET,POST");
	
	Club club=new Club();
	club.setCname(request.getParameter("cname"));
	club.setMinister(request.getParameter("minister"));
	club.setDepart(request.getParameter("depart"));
	club.setEnddata(request.getParameter("enddata"));
	club.setTest(request.getParameter("test"));
	club.setUserid(request.getParameter("userid"));
	club.setState(request.getParameter("state"));
	club.setIsdelete(request.getParameter("isdelete"));
	club.setRemark(request.getParameter("remark"));
	long time=System.currentTimeMillis();
	club.setPubdata(new Timestamp(time));
	System.out.println(club);
	
	ClubDao dao=new ClubDao();
	dao.addclub(club);
	return NONE;
}
}
