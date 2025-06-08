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
		 session.persist(d);
		 tx.commit();
		
		
	}

}
