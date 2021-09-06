package com.example.demo.ex3;

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
import lombok.ToString;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Team {

	@Id @GeneratedValue
	@Column(name="TEAM_ID")
	private Long teamId;
	private String name;
	
	@OneToMany(mappedBy="team")
	private List<Member> members = new ArrayList<Member>();
	
}
