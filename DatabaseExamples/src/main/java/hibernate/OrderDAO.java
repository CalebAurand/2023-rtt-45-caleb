package hibernate;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrderDAO {
	public void updateOrder(Order order) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(order);
		session.getTransaction().commit();
		session.close();
	}

	public Order findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM Order o where o.id = :idParam";

		TypedQuery<Order> query = session.createQuery(hql, Order.class);
		query.setParameter("idParam", id);

		// when we know we are getting back 1 result we use getSingleRecord()
		Order result = query.getSingleResult();

		session.close();

		return result;
	}

	public void insert(Order order) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tr = new session.beginTransaction();

		// NOTE - we are not going to set the id column
		// because hibernate/mySQL will auto generate for us

		session.getTransaction().begin();
		session.save(order);
		session.getTransaction().commit();
		session.close();
	}

	public void deleteOrder(Order order) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(order);
		session.getTransaction().commit();
		session.close();
	}
}
