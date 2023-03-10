package hibernate;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrderDetailsDAO {
	public void updateOrderDetails(OrderDetails orderDetails) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(orderDetails);
		session.getTransaction().commit();
		session.close();
	}

	public OrderDetails findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is hql which is Hibernate Query Language
		// also referred to as JPA
		String hql = "FROM OrderDetails o where o.id = :idParam";

		TypedQuery<OrderDetails> query = session.createQuery(hql, OrderDetails.class);
		query.setParameter("idParam", id);

		// when we know we are getting back 1 result we use getSingleRecord()
		OrderDetails result = query.getSingleResult();

		session.close();

		return result;
	}

	public void insert(OrderDetails orderDetails) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tr = new session.beginTransaction();

		// NOTE - we are not going to set the id column
		// because hibernate/mySQL will auto generate for us

		session.getTransaction().begin();
		session.save(orderDetails);
		session.getTransaction().commit();
		session.close();
	}

	public void deleteOrderDetails(OrderDetails orderDetails) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(orderDetails);
		session.getTransaction().commit();
		session.close();
	}
}
