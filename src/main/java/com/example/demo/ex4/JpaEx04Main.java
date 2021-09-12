package com.example.demo.ex4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaEx04Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			Book book = new Book();
			book.setName("hongma Book");
			book.setAuthor("hongma");
			
			em.persist(book);
			
			tx.commit();
			
		} catch(Exception e){
			tx.rollback();
			
		}finally {
			em.close();
			emf.close();
		}
		
	}
	
	
}
