package cn.strutsDemo;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.Trove;
import cn.hibernateDao.TroveDao;

public class addTrove extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request=ServletActionContext.getRequest();
		Trove trove=new Trove();
		trove.setClubid(request.getParameter("clubid"));
		trove.setUserid(request.getParameter("userid"));
		System.out.println(trove);
		TroveDao dao=new TroveDao();
		dao.addTrove(trove);
		return NONE;
	}
	

}
