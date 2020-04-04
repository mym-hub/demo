package cn.hibernateDao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import cn.entity.Club;

public class ClubDao {
	Session session=null;
	Transaction tx=null;
	public void addclub(Club club)
	{

		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			session.save(club);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public List<Club> getlist(){
		List<Club> list=null;
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			String str="from Club c order by id desc";
			Query query=session.createQuery(str);
			list=query.list();
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}
	public List<Club> getmypt(String userid){
		List<Club> list=null;
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			String str="from Club c where c.userid='"+userid+"' Order by id desc";
			Query query =session.createQuery(str);
			list=query.list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public Club getnewClub() {
		Club club=new Club();
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			String str="from Club order by id desc";
			Query query=session.createQuery(str);
			List<Club> list=query.list();
			club=list.get(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return club;
	}
}
