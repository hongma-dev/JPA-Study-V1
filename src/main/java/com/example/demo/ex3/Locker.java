package com.example.demo.ex3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Locker {

	@Id @GeneratedValue
	private Long id;
	private String name;
	
	@OneToOne(mappedBy="locker")
	private Member member;
}
