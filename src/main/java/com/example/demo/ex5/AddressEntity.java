package com.example.demo.ex5;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ADDRESS")
public class AddressEntity {

	@Id @GeneratedValue
	private Long id;
	
	private Address address;
}
