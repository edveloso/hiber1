package test;

import modelo.Venda;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Principal {
	
	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Venda venda = new Venda();
		venda.setObservacao("Venda para um professor. Cuidado!!");
		
		session.beginTransaction();
		session.save(venda);
		session.getTransaction().commit();
		
		
	}

}
