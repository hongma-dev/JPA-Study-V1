package com.example.demo.ex5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.example.demo.ex4.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseEntity{
	
	@Id @GeneratedValue
	@Column(name="MEMBER_ID")
	private Long id;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Embedded
	private Period period;
	
	@Embedded
	private Address address; 
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="zipCode",column=@Column(name="WORK_CITY") ),
		@AttributeOverride(name="street",column=@Column(name="WORK_STREET") )
	})
	private Address workAddress; 
	
	@ElementCollection
	@CollectionTable(name="FAVORITE_FOOD", joinColumns = @JoinColumn(name="MEMBER_ID"))
	@Column(name="FOOD_NAME")
	private Set<String> favoriteFoods = new HashSet<String>();
	
//	@ElementCollection
//	@CollectionTable(name="ADDRESS", joinColumns = @JoinColumn(name="MEMBER_ID"))
//	private List<Address> addressHisotry = new ArrayList<Address>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name="MEMBER_ID")
	private List<AddressEntity> addressHistory = new ArrayList<AddressEntity>();
}
