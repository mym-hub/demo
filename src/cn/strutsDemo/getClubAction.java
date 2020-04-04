package cn.strutsDemo;

import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.Club;
import cn.hibernateDao.ClubDao;
import net.sf.json.JSONObject;

public class getClubAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		ClubDao dao=new ClubDao();
		List<Club> list=dao.getlist();
		JSONObject jo=new JSONObject();
		int i=1;
		for(Club c:list)
		{
			System.out.println(c);
			jo.put(i, c);
			i++;
		}
		Writer out=response.getWriter();
		out.write(jo.toString());
		out.flush();
		return NONE;
	}
}
