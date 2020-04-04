package cn.strutsDemo;

import java.io.Writer;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.PtUser;
import cn.hibernateDao.PtUserDao;
import net.sf.json.JSONObject;

public class getNewjob extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		PtUser user=new PtUser();
		PtUserDao dao=new PtUserDao();
		user=dao.getNewPt();
		
		JSONObject object=new JSONObject();
		object.put("job", user);
		Writer writer=response.getWriter();
		writer.write(object.toString());
		writer.flush();
		return NONE;
	}
}
