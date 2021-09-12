package com.example.demo.ex4;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity {
	
	@Column(name="REG_USER")
	private String regUser;
	@Column(name="REG_DTTM")
	private LocalDateTime regDttm;
	@Column(name="UPDT_USER")
	private String updtUser;
	@Column(name="UPDT_DTTM")
	private LocalDateTime updtDttm;
	
	
}
