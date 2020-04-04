package cn.hibernateDao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.entity.Trove;

public class TroveDao {
	public void addTrove(Trove trove)
	{
		Session session=null;
		Transaction tx=null;
		try {
			session=Util.returnSession();
			tx=session.beginTransaction();
			
			String str="from Trove c where c.userid="+trove.getUserid()+" and c.clubid="+trove.getClubid();
			System.out.println(str);
			Query query=session.createQuery(str);
			List<Trove> list=query.list();
			if(list.size()==0) {
				session.save(trove);
				tx.commit();
			}
			else {
				System.out.println("ÒÑ´æÔÚ");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
