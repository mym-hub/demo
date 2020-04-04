package cn.hibernateDao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.entity.User;

public class UserDemo {

	public void UserAdd(User user)
	{
		Session session=null;
		Transaction tx=null;
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			String str="select WxOpenID from User c where c.WxOpenID like '%"+user.getWxOpenID()+"%'";
			System.out.println(str);
			Query query=session.createQuery(str);
			List<String> list=query.list();
			if(list.size()==0)
			{
				session.save(user);
				tx.commit();
			}
			else {
				System.out.println("该用户已存在");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
