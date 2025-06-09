package cache;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.StudentData;
import util.HibernateUtility;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * Servlet implementation class CacheServlet
 */
public class CacheServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CacheDemo d = new CacheDemo();
		d.setFullName("Pratiksha");
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction tx = null;
		
		 tx = session.beginTransaction();
		 Query<CacheDemo> q = session.createQuery("from CacheDemo where id = 1");
		 q.setCacheable(true);
		 CacheDemo a = q.uniqueResult();
		 System.out.print(a.getFullName());
	
		 tx.commit();
		session.close();
		
		
		Session session1 = HibernateUtility.getSessionFactory().openSession();
		Transaction tx1 = null;
		
		 tx = session1.beginTransaction();
		 Query<CacheDemo> q2 = session1.createQuery("from CacheDemo where id = 1");
		 q.setCacheable(true);
		 CacheDemo a2 = q2.uniqueResult();
		 System.out.print(a2.getFullName());
	
		 tx.commit();
		session1.close();
		
	}

}
