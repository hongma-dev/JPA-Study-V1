package com.example.demo.ex2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
	
	@Id @GeneratedValue
	@Column(name="ORDER_ITEM_ID")
	private Long id;
	
//	@Column(name="ORDER_ID")
//	private Long orderId;
	
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Orders orders;
	
//	@Column(name="ITEM_ID")
//	private Long itemId;
	
	@ManyToOne
	@JoinColumn(name="ITEM_ID")
	private Item item;
	
	private int orderPrice;
	private int count;
	
}
