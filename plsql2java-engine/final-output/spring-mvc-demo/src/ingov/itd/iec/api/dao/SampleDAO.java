package ingov.itd.iec.api.dao;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ingov.itd.iec.api.model.ToDo;

@Repository
public class SampleDAO{
	private final static Logger log = Logger.getLogger(SampleDAO.class);
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public boolean addUser(ToDo todo){
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		//To do
		//session.save(userdetail);	
		transaction.commit();
		session.close();
		return true;
	}
	

	public List<ToDo> getUser(){
		 Session session = sessionFactory.openSession();
		
		 Transaction transaction = session.beginTransaction();
		// System.out.println("User id is " + username+" password : "+password);
		 
		try {
			//TO Do
		}
		catch(Exception ex) {
		System.out.println("Exception: " +ex.getMessage());	
		}
		finally {
			 transaction.commit();
			 session.close();
		}
		
			 return null;
		 	
		 
		
	}
}