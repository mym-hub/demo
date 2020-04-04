package cn.hibernateDao;

import java.util.List;

import javax.persistence.criteria.Order;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.entity.PtUser;
import cn.entity.User;

public class PtUserDao {
	Session session=null;
	Transaction tx=null;
	public void addUser(PtUser user) {

		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			String str="from PtUser c where c.name='"+user.getName()+"' and c.test like '%"+user.getTest()+"%'";
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
	public List<PtUser> Userlist() {
		List list=null;
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			Criteria criteria=session.createCriteria(PtUser.class);
			list=criteria.list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<PtUser> publicinfo(String job) {
		List list=null;
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			String str="from PtUser c where c.job="+job;
			Query query=session.createQuery(str);
			list=query.list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<User> getuserid(String name,String url) {
		List list=null;
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			String str="from User c where c.NickName='"+name+"'  and c.avatarUrl like '%"+url+"%' and c.WxOpenID is not NULL";
			System.out.println(str);
			Query query=session.createQuery(str);
			list=query.list();
			System.out.println(list);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public PtUser getNewPt() {
		PtUser user=null;
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			String str="from PtUser order by id desc";
			Query query=session.createQuery(str);
			List<PtUser> list=query.list();
			user=list.get(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	public List<PtUser> getmypt(String userid){
		List<PtUser> list=null;
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			String str="from PtUser c where c.userid='"+userid+"' Order by id desc";
			Query query =session.createQuery(str);
			list=query.list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
