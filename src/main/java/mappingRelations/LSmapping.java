package mappingRelations;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.HibernateUtility;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class LSmapping extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction(); 
		
//		1st instance of Laptop
		Laptops l1 = new Laptops();
		l1.setLname("Dell");
	
//		2nd instance of Laptop
		Laptops l2 = new Laptops();
		l2.setLname("hp");
		
//		list of laptops instances
		List<Laptops> list = new ArrayList<>() ;
		list.add(l1);
		list.add(l2);
		
//		Student Instance 1
		Student s1 = new Student();
		s1.setName("MD");
		s1.setLaptop(list);
		
//		Student Instance 2
		Student s2 = new Student();
		s2.setName("RD");
		s2.setLaptop(list);
		
		
		
		try {
		session.persist(l1);
		session.persist(l2);
		session.persist(s1);
		session.persist(s2);
		tx.commit();
		out.print("<html><body><h1>Data saved Sucessfully </h1></body></html>");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		session.clear();
	}

}
