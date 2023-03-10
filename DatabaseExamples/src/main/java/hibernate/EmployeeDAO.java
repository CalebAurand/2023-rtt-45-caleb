package hibernate;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
	public void updateEmployee(Employee employee) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(employee);
		session.getTransaction().commit();
		session.close();
	}
	
	public Employee findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Employee e where e.id = :idParam";
		
		TypedQuery<Employee> query = session.createQuery(hql,Employee.class);
		query.setParameter("idParam", id);
		
		// when we know we are getting back 1 result we use getSingleRecord()
		Employee result = query.getSingleResult();
		
		session.close();
		
		return result;
	}
	
	public List<Employee> findByContactFirstName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Employee e where e.contactFirstName = :firstName";
		
		TypedQuery<Employee> query = session.createQuery(hql,Employee.class);
		query.setParameter("firstName", name);
		
		//when we know we are getting 0 or more records we use getResultList()
		List<Employee> result = query.getResultList();
		
		session.close();
		
		return result;
	}
	
	public void insert(Employee employee) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tr = new session.beginTransaction();
		
		// NOTE - we are not going to set the id column
		// because hibernate/mySQL will auto generate for us
		
		
		session.getTransaction().begin();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteEmployee(Employee employee) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(employee);
		session.getTransaction().commit();
		session.close();
	}
}
