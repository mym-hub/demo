package cn.strutsDemo;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.PtUser;
import cn.hibernateDao.PtUserDao;

public class baseInfo extends ActionSupport {
@Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
	HttpServletRequest request=ServletActionContext.getRequest();
	PtUser user=new PtUser();
	user.setName(request.getParameter("name1"));
	user.setStartdata(request.getParameter("startdata"));
	user.setEnddata(request.getParameter("enddata"));
	user.setPhone(request.getParameter("phone"));
	user.setSelery(request.getParameter("selery")); 
	user.setTest(request.getParameter("testarea")); 
	user.setAddr(request.getParameter("addr"));
	user.setJob(request.getParameter("job"));
	user.setState(request.getParameter("state"));
	user.setUserid(request.getParameter("userid"));
	user.setAddtime(request.getParameter("addtime"));
	user.setIsdelete(request.getParameter("isdelete"));
	System.out.println(user.toString());
	PtUserDao dao=new PtUserDao();
	dao.addUser(user);
	return NONE;
}
}
