package cn.hibernateDao;

import java.util.List;

import org.apache.struts2.components.Select;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.entity.PtUser;
import cn.entity.login;

public class loginDao {
	Session session=null;
	Transaction ts=null;
	public int Userlogin(String name,String pwd)
	{
		int flag=-1;
		
		try {
			session=Util.returnSession();
			ts=session.beginTransaction();
			login login=new login();
			login.setUname(name);
			login.setPwd(pwd);
			String str="from login c where c.uname='"+login.getUname()+"' and c.pwd='"+login.getPwd()+"'";
			Query query=session.createQuery(str);
			List list=query.list();
			if(list.size()==0)
				flag=0;
			else if(list.size()>0)
				flag=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public List<PtUser> getPtUser()
	{
		List<PtUser> list = null;
		try {
			session=Util.returnSession();
			ts=session.beginTransaction();
			
			String str="from PtUser user";
			Query query=session.createQuery(str);
			list=query.list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
