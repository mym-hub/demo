package cn.strutsDemo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.struts2.ServletActionContext;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;

import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONObject;
import cn.entity.User;
import cn.hibernateDao.UserDemo;

public class UserAction extends ActionSupport {
	static String openid;
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=gb2312");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");

		String code = request.getParameter("code");
		
		String appSecret = "1571428ad57131a4b09827d9cf8292a7";
		String appId = "wx27907090e933a9ce";
		String session_key;
		String getOpenIdUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appId + "&secret=" + appSecret
				+ "&js_code=" + code + "&grant_type=authorization_code";
		if (code != null) {
			// 获取openid和access_token的连接
			// 获取返回的code
			@SuppressWarnings("resource")
			HttpClient httpClient = new DefaultHttpClient();
			HttpGet httpGet = new HttpGet(getOpenIdUrl);
			ResponseHandler<String> responseHandler = new BasicResponseHandler();
			// 向微信发送请求并获取response
			String responseBody = httpClient.execute(httpGet, responseHandler);
			JSONObject jsonObject = JSONObject.fromObject(responseBody);
			openid = jsonObject.getString("openid");
			session_key = jsonObject.getString("session_key");
			setopenid(openid);
		}
		return NONE;
	}
	public void setopenid(String openid)
	{
		openid=this.openid;
	}
	public String getopenid()
	{
		return openid;
	}

}
