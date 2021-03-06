package cn.strutsDemo;

import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.PtUser;
import cn.hibernateDao.PtUserDao;
import net.sf.json.JSONObject;

public class myPublicPt extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		String userid=request.getParameter("userid");
		PtUserDao dao=new PtUserDao();
		List<PtUser> list=dao.getmypt(userid);
		
		JSONObject jo=new JSONObject();
		jo.put("list", list);
		jo.put("len", list.size());
		Writer writer=response.getWriter();
		writer.write(jo.toString());
		writer.flush();
		return NONE;
	}
}
