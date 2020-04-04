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

public class MyPublic extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		String job=request.getParameter("job");
		PtUserDao dao=new PtUserDao();
		List<PtUser> list=dao.publicinfo(job);
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
