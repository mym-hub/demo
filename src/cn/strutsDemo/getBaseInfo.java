package cn.strutsDemo;

import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.entity.BaseInfo;
import cn.entity.PtUser;
import cn.hibernateDao.BaseInfoDao;
import net.sf.json.JSONObject;

public class getBaseInfo extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		String userid=request.getParameter("userid");
		BaseInfoDao dao=new BaseInfoDao();
		BaseInfo info=new BaseInfo();
		info=dao.getinfo(userid);
		JSONObject jO=new JSONObject();
		if(info!=null)
		{
			jO.put("info", info);
			jO.put("stat", 1);
		}else {
			jO.put("stat", 0);
		}
		Writer out=response.getWriter();
		out.write(jO.toString());
		out.flush();
		return NONE;
	}
}
