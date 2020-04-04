package cn.strutsDemo;

import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.Club;
import cn.entity.PtUser;
import cn.hibernateDao.PtUserDao;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import net.sf.json.groovy.GJson;

public class UserInfoDemo extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletResponse response=ServletActionContext.getResponse();
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		PtUserDao dao=new PtUserDao();
		List<PtUser> list= dao.Userlist();
		
		JSONObject jO=new JSONObject();
		int i=1;
		for(PtUser user:list) {
			System.out.println(user);
			jO.put(i, user);
			i++;
		}
		Writer out=response.getWriter();
		out.write(jO.toString());
		out.flush();
		return NONE;
	}
}
