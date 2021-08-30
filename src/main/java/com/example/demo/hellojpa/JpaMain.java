package com.example.demo.hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
		
//			Member member = new Member();
//			member.setId(100L);
//			member.setName("hongma");
			
//			em.persist(member);
//			tx.commit();
			
			Member findMember1 = em.find(Member.class,100L);
			findMember1.setName("hongmamamama");
			
			em.flush();
			
			Member findMember2 = em.find(Member.class,100L);
			
			System.out.println("result = " + (findMember1 == findMember2));
			
			tx.commit();
			
		} catch(Exception e){
			tx.rollback();
			
		}finally {
			em.close();
			emf.close();
		}
		
	}

}
