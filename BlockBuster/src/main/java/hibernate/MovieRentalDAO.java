package hibernate;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MovieRentalDAO {
	public void updateMovieRental(MovieRental movieRental) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(movieRental);
		session.getTransaction().commit();
		session.close();
	}
	
	public MovieRental findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM MovieRental m where m.id = :idParam";
		
		TypedQuery<MovieRental> query = session.createQuery(hql,MovieRental.class);
		query.setParameter("idParam", id);
		
		// when we know we are getting back 1 result we use getSingleRecord()
		MovieRental result = query.getSingleResult();
		
		session.close();
		
		return result;
	}
	
	public void insert(MovieRental movieRental) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tr = new session.beginTransaction();
		
		// NOTE - we are not going to set the id column
		// because hibernate/mySQL will auto generate for us
		
		
		session.getTransaction().begin();
		session.save(movieRental);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteMovieRental(MovieRental movieRental) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(movieRental);
		session.getTransaction().commit();
		session.close();
	}
	
	public List<MovieRental> getAllMovieRentals(){
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM MovieRental m";
		
		TypedQuery<MovieRental> query = session.createQuery(hql,MovieRental.class);
		
		// when we know we are getting back 1 result we use getSingleRecord()
		List<MovieRental> results = query.getResultList();
		
		session.close();
		
		return results;
	}
}
