//Reads hibernate.cfg.xml
//Builds a SessionFactory once (singleton)
//Provides static method to access SessionFactory

package util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtility {
	private static SessionFactory sessionfactory;
	
	static {
		try {
			sessionfactory = new Configuration().configure().buildSessionFactory();
		}catch(HibernateException hex){
			System.out.println(hex.getMessage());
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionfactory;
	}
}
