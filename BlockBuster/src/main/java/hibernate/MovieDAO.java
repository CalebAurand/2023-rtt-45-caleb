package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class MovieDAO {
	public void updateMovie(Movie movie) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(movie);
		session.getTransaction().commit();
		session.close();
	}
	
	public Movie findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Movie m where m.id = :idParam";
		
		TypedQuery<Movie> query = session.createQuery(hql,Movie.class);
		query.setParameter("idParam", id);
		
		// when we know we are getting back 1 result we use getSingleRecord()
		Movie result = query.getSingleResult();
		
		session.close();
		
		return result;
	}
	
	public List<Movie> findByMovieName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Movie m where m.name = :paramName";
		
		TypedQuery<Movie> query = session.createQuery(hql,Movie.class);
		query.setParameter("paramName", name);
		
		//when we know we are getting 0 or more records we use getResultList()
		List<Movie> result = query.getResultList();
		
		session.close();
		
		return result;
	}
	
	public void insert(Movie movie) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tr = new session.beginTransaction();
		
		// NOTE - we are not going to set the id column
		// because hibernate/mySQL will auto generate for us
		
		
		session.getTransaction().begin();
		session.save(movie);
		session.getTransaction().commit();
		session.close();
	}
	
	public void deleteMovie(Movie movie) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(movie);
		session.getTransaction().commit();
		session.close();
	}
	
	public List<Movie> getMovies(){
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM Movie m";
		
		TypedQuery<Movie> query = session.createQuery(hql,Movie.class);
		
		//when we know we are getting 0 or more records we use getResultList()
		List<Movie> result = query.getResultList();
		
		session.close();
		
		return result;
	}
}
