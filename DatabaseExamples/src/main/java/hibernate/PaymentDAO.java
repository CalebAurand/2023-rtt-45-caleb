package hibernate;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PaymentDAO {
	public void updatePayment(Payment payment) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(payment);
		session.getTransaction().commit();
		session.close();
	}
	
	public Payment findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Payment p where p.id = :idParam";
		
		TypedQuery<Payment> query = session.createQuery(hql,Payment.class);
		query.setParameter("idParam", id);
		
		// when we know we are getting back 1 result we use getSingleRecord()
		Payment result = query.getSingleResult();
		
		session.close();
		
		return result;
	}
	
	
	public void insert(Payment payment) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tr = new session.beginTransaction();
		
		// NOTE - we are not going to set the id column
		// because hibernate/mySQL will auto generate for us
		
		
		session.getTransaction().begin();
		session.save(payment);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deletePayment(Payment payment) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(payment);
		session.getTransaction().commit();
		session.close();
	}
}
