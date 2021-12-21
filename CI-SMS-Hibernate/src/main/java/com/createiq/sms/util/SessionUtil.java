package com.createiq.sms.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

	private static SessionFactory sessionFactory = null;

	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	public static Session getSession() {
		return sessionFactory.openSession();
	}

	public static void close(Session session) {
		if (session != null) {
			session.close();
		}
	}

}
