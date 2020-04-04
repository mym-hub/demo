package cn.strutsDemo;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.User;
import cn.hibernateDao.UserDemo;

public class UserInfoAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserAction aa=new UserAction();
	UserDemo bb=new UserDemo();
	User user=new User();
	String openid=aa.getopenid();
	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		
		String nickName=request.getParameter("nickName");
		String avatarUrl=request.getParameter("avatarUrl");
		String province=request.getParameter("province");
		String country=request.getParameter("country");
		String city=request.getParameter("city");
		String sex=request.getParameter("gender");
		String phone=request.getParameter("phone");
		String address=country+province+city;
		String headurl=request.getParameter("Headurl");
		String codeurl=request.getParameter("codeurl");
		System.out.println(request.getParameter("cookie"));
		user.setNickName(nickName);
		user.setAvatarUrl(avatarUrl);
		user.setAddress(country+province+city);
		user.setWxCodeUrl(codeurl);
		user.setPhone(phone);
		user.setSex(sex);
		long time=System.currentTimeMillis();
		user.setAddTime(new Timestamp(time));
		
		String isdelete="1";
		user.setIsDeleted(isdelete);
		user.setWxOpenID(openid);
		System.out.println(user);
		bb.UserAdd(user);
		
		return NONE;
	}

}
