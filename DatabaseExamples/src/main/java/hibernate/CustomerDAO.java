package hibernate;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerDAO {
	
	
	public void updateCustomer(Customer customer) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(customer);
		session.getTransaction().commit();
		session.close();
	}
	
	public Customer findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Customer c where c.id = :idParam";
		
		TypedQuery<Customer> query = session.createQuery(hql,Customer.class);
		query.setParameter("idParam", id);
		
		// when we know we are getting back 1 result we use getSingleRecord()
		Customer result = query.getSingleResult();
		
		session.close();
		
		return result;
	}
	
	public List<Customer> findByContactFirstName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Customer c where c.contactFirstName = :firstName";
		
		TypedQuery<Customer> query = session.createQuery(hql,Customer.class);
		query.setParameter("firstName", name);
		
		//when we know we are getting 0 or more records we use getResultList()
		List<Customer> result = query.getResultList();
		
		session.close();
		
		return result;
	}
	
	public void insert(Customer customer) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tr = new session.beginTransaction();
		
		// NOTE - we are not going to set the id column
		// because hibernate/mySQL will auto generate for us
		
		
		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteCustomer(Customer customer) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(customer);
		session.getTransaction().commit();
		session.close();
	}
}
