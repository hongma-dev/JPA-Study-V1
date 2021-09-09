package com.example.demo.ex3;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id @GeneratedValue
	private Long id;
	private String name;
	
	@OneToMany(mappedBy="product")
	private List<MemberProduct> memberProducts = new ArrayList<>();
}
