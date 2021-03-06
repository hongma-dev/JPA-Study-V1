package com.example.demo.ex3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaEx03Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			
			//팀 저장
//			 Team team = new Team();
//			 team.setName("TeamA");
//			 em.persist(team);
			 
			 
			 //회원 저장
//			Member member = new Member();
//			member.setUsername("member1");
//			member.setTeam(team); //단방향 연관관계 설정, 참조 저장
//			em.persist(member);

			
//			Team findTeam = member.getTeam();
//			System.out.println(findTeam);
			 
//			em.flush();
//			em.clear();
			
			Member findMember = em.find(Member.class,2L);
			List<Member> members = findMember.getTeam().getMembers();
			
			
			for(Member m : members) {
				System.out.println("!!!!!!!!!!!!!!!!!: " +m.getUsername());
			}
			
			tx.commit();
			
		} catch(Exception e){
			tx.rollback();
			
		}finally {
			em.close();
			emf.close();
		}
		
	}
	
	
}
