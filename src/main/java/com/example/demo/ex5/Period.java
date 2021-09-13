package com.example.demo.ex5;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Period {

	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	
}
