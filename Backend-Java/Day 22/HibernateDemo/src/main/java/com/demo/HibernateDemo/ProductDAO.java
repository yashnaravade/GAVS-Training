package com.demo.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.HibernateDemo.config.HibernateUtility;
import com.demo.HibernateDemo.entities.Product;

public class ProductDAO {
    private SessionFactory sessionFactory;

    public ProductDAO() {
        this.sessionFactory = HibernateUtility.getSessionFactoryObject();
    }

    @SuppressWarnings("deprecation")
	public void createProduct(Product product) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.save(product);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Product getProductById(int productId) {
        Session session = sessionFactory.openSession();
        Product product = null;

        try {
            product = session.get(Product.class, productId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return product;
    }

    @SuppressWarnings("deprecation")
	public void updateProduct(Product product) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.update(product);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @SuppressWarnings("deprecation")
	public void deleteProduct(Product product) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.delete(product);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
