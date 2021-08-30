package com.example.demo.hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	@Id
	private Long id;
	private String name;
	
	
	
}
