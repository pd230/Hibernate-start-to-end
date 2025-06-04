package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import jakarta.persistence.PersistenceException;
import model.StudentData;
import util.HibernateUtility;

public class UserDao {
     
	public boolean RegisterUser(String fname, String lname, String email, String uname, String password) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		boolean exists = false;
		Transaction tx = null;
		try {
		 tx = session.beginTransaction();
		 StudentData sd = new StudentData();
		 String fullname = fname + " "+ lname;
    	 sd.setFullName(fullname);
    	 sd.setEmail(email);
    	 sd.setUname(uname);
    	 sd.setPassword(password);
    	  session.persist(sd);
    	  tx.commit();
    	 }catch(ConstraintViolationException e) {
    		 exists = true;
    		 if (tx != null) tx.rollback();
    	        System.out.println("ConstraintViolationException caught: duplicate username.");
//    	 }catch(PersistenceException e){
//    		 exists = true;
//    		 if (tx != null) tx.rollback();
//    		   System.out.println("ConstraintViolationException caught: duplicate username.");
//    	 }
    	 }finally {
    		 session.close();
    	 }
		System.out.println("RegisterUser() returns exists = " + exists);
    	 return exists; 
     }
}
