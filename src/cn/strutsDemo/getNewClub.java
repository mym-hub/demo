package cn.strutsDemo;

import java.io.Writer;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.Club;
import cn.hibernateDao.ClubDao;
import net.sf.json.JSONObject;

public class getNewClub extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		Club club=new Club();
		ClubDao dao=new ClubDao();
		club=dao.getnewClub();
		
		
		JSONObject object=new JSONObject();
		object.put("club", club);
		Writer writer=response.getWriter();
		writer.write(object.toString());
		writer.flush();
		return NONE;
	}
}
