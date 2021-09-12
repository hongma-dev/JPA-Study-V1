package com.example.demo.ex3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.example.demo.ex2.domain.Orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Delivery {

	@Id @GeneratedValue
	private Long id;
	
	@OneToOne(mappedBy="delivery")
	private Orders order;
	
	private String city;
	private String street;
	private String zipcode;
	private DeliveryStatus deliveryStatus;
}
