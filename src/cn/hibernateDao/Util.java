package cn.hibernateDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
	static Configuration cfg=null;
	static SessionFactory sf=null;
	static{
		cfg=new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
	}

	public static Session returnSession()
	{
		return sf.getCurrentSession();
	}
}
