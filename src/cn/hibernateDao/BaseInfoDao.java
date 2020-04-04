package cn.hibernateDao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.entity.BaseInfo;

public class BaseInfoDao {
	public void addbaseinfo(BaseInfo info) {
		Session session=null;
		Transaction tx=null;
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			String str="from BaseInfo c where c.userid="+info.getUserid();
			System.out.println(str);
			Query query=session.createQuery(str);
			List<BaseInfo> list=query.list();
			BaseInfo info1=new BaseInfo();
			if(list.size()==0)
			{
				session.save(info);
				tx.commit();
			}
			else {
				System.out.println("该用户已存在");
				info1=list.get(0);
				info1.setName(info.getName());
				info1.setPhone(info.getPhone());
				info1.setXueyuan(info.getXueyuan());
				info1.setSushe(info.getSushe());
				info1.setPhoto(info.getPhoto());
				session.save(info1);
				tx.commit();	
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public BaseInfo getinfo(String userid)
	{
		Session session=null;
		Transaction tx=null;
		BaseInfo info=null;
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			String str="from BaseInfo c where c.userid="+userid;
			System.out.println(str);
			Query query=session.createQuery(str);
			List<BaseInfo> list=query.list();
			BaseInfo info1=new BaseInfo();
			if(list.size()==0)
			{
				info=null;
			}
			else {
				System.out.println("该用户已存在");
				info=list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return info;
	}

}
