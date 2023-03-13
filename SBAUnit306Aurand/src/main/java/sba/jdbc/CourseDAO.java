package sba.jdbc;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CourseDAO {
	public Course findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Course c where c.id = :idParam";
		
		TypedQuery<Course> query = session.createQuery(hql,Course.class);
		query.setParameter("idParam", id);
		
		// when we know we are getting back 1 result we use getSingleRecord()
		Course result = query.getSingleResult();
		
		session.close();
		
		return result;
	}
	
	public List<Course> findByCourseName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Course c where c.name = :paramName";
		
		TypedQuery<Course> query = session.createQuery(hql,Course.class);
		query.setParameter("paramName", name);
		
		//when we know we are getting 0 or more records we use getResultList()
		List<Course> result = query.getResultList();
		
		session.close();
		
		return result;
	}
	
	public void insert(Course course) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tr = new session.beginTransaction();
		
		// NOTE - we are not going to set the id column
		// because hibernate/mySQL will auto generate for us
		
		
		session.getTransaction().begin();
		session.save(course);
		session.getTransaction().commit();
		session.close();
	}
	
	public void updateCourse(Course course) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(course);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteCourse(Course course) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(course);
		session.getTransaction().commit();
		session.close();
	}
}
