package cn.strutsDemo;

import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.PtUser;
import cn.entity.User;
import cn.hibernateDao.PtUserDao;
import net.sf.json.JSONObject;

public class getUserId extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=gb2312");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		
		String name=request.getParameter("data2");
		String url=request.getParameter("data1");
		System.out.println(name+"      "+url);
		PtUserDao dao=new PtUserDao();
		List<User> list=dao.getuserid(name, url);
		int userid=0;
		for(User user:list)
		{
			userid=user.getUserID();
		}
		JSONObject jO=new JSONObject();
		jO.put("a", userid);
		Writer out=response.getWriter();
		out.write(jO.toString());
		out.flush();
		return NONE;
	}

}
