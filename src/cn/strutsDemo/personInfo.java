package cn.strutsDemo;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.BaseInfo;
import cn.hibernateDao.BaseInfoDao;

public class personInfo extends ActionSupport {
@Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
	HttpServletRequest request=ServletActionContext.getRequest();
	BaseInfo info=new BaseInfo();
	info.setUserid(request.getParameter("userid"));
	info.setName(request.getParameter("name"));
	info.setPhone(request.getParameter("phone"));
	info.setXueyuan(request.getParameter("sushe"));
	info.setSushe(request.getParameter("xueyuan"));
	info.setPhoto(request.getParameter("photo"));
	BaseInfoDao dao=new BaseInfoDao();
	dao.addbaseinfo(info);
	return NONE;
}
}
