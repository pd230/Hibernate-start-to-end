package hqlDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.HibernateUtility;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

/**
 * Servlet implementation class HqlServlet
 */
public class HqlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		Random rand = new Random();
//		Session session = HibernateUtility.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
		
//		insert data into table Hql_Product
		
//		for(int i=1; i<=20; i++) {
//			Hql_Product hp = new Hql_Product();
//			hp.setSname("abc"+i);
//			hp.setQuantity(rand.nextInt(100) );
//		    session.persist(hp);
//		    
//		}
		
		
//		retrive all the data from table 
		
//		String sql = "from Hql_Product";
//		Query q = session.createQuery(sql);
//		List<Hql_Product> list = q.getResultList();
//		int i = 0;
//		while( i < list.size()) {
//			System.out.println(list.get(i));
//			i++;
//		}

		
//		retrive data from table using where clause
//		String sql = "select sname from Hql_Product where quantity > 50";
//		Query q = session.createQuery(sql);
//		List<Hql_Product> list = q.getResultList();
//		int i = 0;
//		while( i < list.size()) {
//			System.out.println(list.get(i));
//			i++;
//		}

//      retrive single result from table using where clause
		
//		String sql = "select id,sname,quantity from Hql_Product where sname = :sname";
//		Query q =  session.createQuery(sql);
//		q.setParameter("sname", "abc15");
//		Object[] obj = (Object[])q.getSingleResult();
//		
//		for(Object o : obj) {
//			System.out.println(o);
//		}
		
//		
//		String sql = "select sum(quantity) from Hql_Product WHERE quantity > :quantity";
//		Query q =  session.createQuery(sql);
//		q.setParameter("quantity", 40);
//		Long sum = (Long)q.getSingleResult();
//		System.out.println(sum);
		
//		native Queries: Using sql in hql
		
//		String sql = "Select * from Hql_Product";
//		NativeQuery<Hql_Product> sqlQuery = session.createNativeQuery(sql, Hql_Product.class);
//		List<Hql_Product> list =  sqlQuery.list();
//		
//		for(Hql_Product h : list) {
//			System.out.println(h.getId()+" "+h.getSname()+" "+h.getQuantity());
//		}
		
		
//		String sql = "select id,sname, quantity from Hql_Product where quantity > 30";
//		NativeQuery<Hql_Product> nq = session.createNativeQuery(sql, Hql_Product.class);
//		List<Hql_Product> list = nq.list();
//		
//		for(Hql_Product l :list) {
//			System.out.println(l.getId()+  " : " + l.getSname());
//		}

//		tx.commit();
//		session.close();
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		
		Hql_Product h = em.find(Hql_Product.class, 102);
		System.out.println(h.toString());
		
		
		
	}

}
