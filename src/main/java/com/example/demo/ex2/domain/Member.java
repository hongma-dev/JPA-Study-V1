package com.example.demo.ex2.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Member {

	@Id @GeneratedValue
	@Column(name="member_id")
	private Long id;
	private String name;
	private String city;
	private String street;
	private String zipcode;
	
	@OneToMany(mappedBy="member")
	private List<Orders> orders = new ArrayList<>();
}
