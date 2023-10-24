package com.demo.HibernateDemo.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
 
import com.demo.HibernateDemo.entities.Product;
 
public class HibernateUtility {
	private static SessionFactory sessionFactory=getSessionFactory();
	
	public static SessionFactory getSessionFactoryObject() {
		return sessionFactory;
	}
	private static SessionFactory getSessionFactory() {
		//create configuration object
		Configuration config=new Configuration();
		//Add entity mapping
		config.addAnnotatedClass(Product.class);
		//Standard registry builder object
		StandardServiceRegistryBuilder ssrb=new StandardServiceRegistryBuilder();
		//load the properties
		Properties properties=config.getProperties();
		//Service registry with properties
		ServiceRegistry serviceRegistry=ssrb.applySettings(properties).build();
		//Create Session Factory
		sessionFactory=config.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}
	
}
