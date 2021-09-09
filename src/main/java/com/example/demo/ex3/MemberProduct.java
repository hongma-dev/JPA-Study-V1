package com.example.demo.ex3;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberProduct {

	@Id @GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="MEMBER_ID")
	private Member member;
	
	@Id
	@JoinColumn(name="PRODUCT_ID")
	private Product product;
	
	private int orderamount;
	private LocalDateTime orderDate;
}
