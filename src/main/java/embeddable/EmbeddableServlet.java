package embeddable;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.HibernateUtility;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Servlet implementation class EmbeddableServlet
 */
public class EmbeddableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		int age = Integer.parseInt(request.getParameter("age"));
		
		EbdDemo2_FullName ef = new EbdDemo2_FullName();
		ef.setFname(fname);
		ef.setMname(mname);
		ef.setLname(lname);
		
		EbdDemo1_Alien ea = new EbdDemo1_Alien();
		ea.setAge(age);
		ea.setEf(ef);
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(ea);
		tx.commit();
		session.close();
	}

}
