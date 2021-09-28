package jpabook.jpashop;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
	public static void main(String[] args) {
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("hello");
		 
		EntityManager em = enf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		try {
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			em.close();
		}
		
		enf.close();
	}

}
