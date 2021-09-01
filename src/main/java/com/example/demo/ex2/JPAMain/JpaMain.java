package com.example.demo.ex2.JPAMain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.example.demo.ex2.domain.Member;

public class JpaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			
			
			tx.commit();
			
		} catch(Exception e){
			tx.rollback();
			
		}finally {
			em.close();
			emf.close();
		}
		
	}

}