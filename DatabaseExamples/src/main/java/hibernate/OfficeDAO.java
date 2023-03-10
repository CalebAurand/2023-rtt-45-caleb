package hibernate;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OfficeDAO {
	public void updateProductDetails(Office office) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(office);
		session.getTransaction().commit();
		session.close();
	}

	public Office findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Office o where o.id = :idParam";

		TypedQuery<Office> query = session.createQuery(hql, Office.class);
		query.setParameter("idParam", id);

		// when we know we are getting back 1 result we use getSingleRecord()
		Office result = query.getSingleResult();

		session.close();

		return result;
	}
	
	

	public void insert(Office office) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tr = new session.beginTransaction();

		// NOTE - we are not going to set the id column
		// because hibernate/mySQL will auto generate for us

		session.getTransaction().begin();
		session.save(office);
		session.getTransaction().commit();
		session.close();
	}

	public void deleteProductDetails(Office office) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(office);
		session.getTransaction().commit();
		session.close();
	}
}
