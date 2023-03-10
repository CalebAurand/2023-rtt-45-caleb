package hibernate;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductDAO {
	public void updateProductDetails(Product product) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(product);
		session.getTransaction().commit();
		session.close();
	}

	public Product findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Product p where p.id = :idParam";

		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter("idParam", id);

		// when we know we are getting back 1 result we use getSingleRecord()
		Product result = query.getSingleResult();

		session.close();

		return result;
	}
	
	

	public void insert(Product product) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tr = new session.beginTransaction();

		// NOTE - we are not going to set the id column
		// because hibernate/mySQL will auto generate for us

		session.getTransaction().begin();
		session.save(product);
		session.getTransaction().commit();
		session.close();
	}

	public void deleteProductDetails(Product product) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(product);
		session.getTransaction().commit();
		session.close();
	}
	
	public List<Product> findByName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Product p where p.productName like :nameParam";

		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter("nameParam", '%'+name);

		// when we know we are getting back 1 result we use getSingleRecord()
		List<Product> results = query.getResultList();

		session.close();

		return results;
	}
}
