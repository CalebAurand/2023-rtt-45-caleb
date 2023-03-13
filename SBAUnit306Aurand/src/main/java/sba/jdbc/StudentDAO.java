package sba.jdbc;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sba.jdbc.Student;

public class StudentDAO {
	public Student findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Student s where s.id = :idParam";
		
		TypedQuery<Student> query = session.createQuery(hql,Student.class);
		query.setParameter("idParam", id);
		
		// when we know we are getting back 1 result we use getSingleRecord()
		Student result = query.getSingleResult();
		
		session.close();
		
		return result;
	}
	
	public List<Student> findByStudentName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Student s where s.name = :paramName";
		
		TypedQuery<Student> query = session.createQuery(hql,Student.class);
		query.setParameter("paramName", name);
		
		//when we know we are getting 0 or more records we use getResultList()
		List<Student> result = query.getResultList();
		
		session.close();
		
		return result;
	}
	
	public void insert(Student student) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tr = new session.beginTransaction();
		
		// NOTE - we are not going to set the id column
		// because hibernate/mySQL will auto generate for us
		
		
		session.getTransaction().begin();
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}
	
	public void updateStudent(Student student) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(student);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteStudent(Student student) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(student);
		session.getTransaction().commit();
		session.close();
	}
	
//	public List<Student> getStudents(){
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Session session = factory.openSession();
//		String hql = "FROM Student s";
//		
//		TypedQuery<Student> query = session.createQuery(hql,Student.class);
//		
//		//when we know we are getting 0 or more records we use getResultList()
//		List<Student> result = query.getResultList();
//		
//		session.close();
//		
//		return result;
//	}
}
